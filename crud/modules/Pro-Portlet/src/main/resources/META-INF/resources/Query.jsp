<%@page import="com.liferay.portal.kernel.dao.orm.Property"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Junction"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Criterion"%>
<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil"%>
<%@page import="com.demo.crud.service.SportsLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.PortalClassLoaderUtil"%>
<%@page import="com.demo.crud.model.Sports"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@ include file="/init.jsp" %>

<h4>Simple Dynamic Query</h4>

<%
DynamicQuery sportsQuery = DynamicQueryFactoryUtil.forClass(Sports.class, PortalClassLoaderUtil.getClassLoader());

List<Sports> sportsList=SportsLocalServiceUtil.dynamicQuery(sportsQuery);
for(Sports sports:sportsList){
out.println(sports.getSportsName()+"<br/>");
}
%> 
<h4>.............................................</h4>
<h4>Property Factory Util AND condition Checking</h4>

<%
DynamicQuery sportsQuery1 = DynamicQueryFactoryUtil.forClass(Sports.class, PortalClassLoaderUtil.getClassLoader());

sportsQuery1.add(PropertyFactoryUtil.forName("sportsName").eq(new String ("cricket")));
sportsQuery1.add(PropertyFactoryUtil.forName("description").eq(new String ("bat and ball")));
List<Sports> sportsList1 = SportsLocalServiceUtil.dynamicQuery(sportsQuery1);

for(Sports sports : sportsList1){
	out.println(sports.getSportsId()+ sports.getDescription()+ "<br/>");
}
%>

<h4>.............................................</h4>
<h4>Criteria Object using Restriction Factory util AND Operator</h4>

<%-- <%
DynamicQuery sportsQuery2 = DynamicQueryFactoryUtil.forClass(Sports.class, PortalClassLoaderUtil.getClassLoader());

Criterion criterion = null;

criterion = RestrictionsFactoryUtil.eq("sportsName", new String("Hand ball"));
criterion = RestrictionsFactoryUtil.and(criterion, RestrictionsFactoryUtil.eq("description", new String("ball")));
sportsQuery2.add(criterion);

List<Sports> sportsList2 = SportsLocalServiceUtil.dynamicQuery(sportsQuery2);

for(Sports sports : sportsList2){
	out.println(sports.getSportsId() + "<br/>");
}
%> --%>

<h4>.............................................</h4>
<h4>Criteria Object using Restriction Factory util OR Operator</h4>

<%
DynamicQuery sportsQuery3 = DynamicQueryFactoryUtil.forClass(Sports.class, PortalClassLoaderUtil.getClassLoader());

Criterion criterion1 = null;

criterion1 = RestrictionsFactoryUtil.eq("sportsName", new String("Hand ball"));
criterion1 = RestrictionsFactoryUtil.or(criterion1, RestrictionsFactoryUtil.eq("description", new String("asdf")));
sportsQuery3.add(criterion1);

List<Sports> sportsList3 = SportsLocalServiceUtil.dynamicQuery(sportsQuery3);

for(Sports sports : sportsList3){
	out.println(sports.getSportsName() + "<br/>");
}
%>

<h4>.............................................</h4>
<h4>Like operator Criteria</h4>

<%
DynamicQuery sportsQuery4 = DynamicQueryFactoryUtil.forClass(Sports.class, PortalClassLoaderUtil.getClassLoader());
Criterion criterion2 = null;
//criterion2 = RestrictionsFactoryUtil.like("sportsName",new StringBuilder("%").append("me").append("%").toString());


criterion2 = RestrictionsFactoryUtil.like("sportsName", new StringBuilder("%").append("ric").append("%").toString());
criterion2=RestrictionsFactoryUtil.or(criterion2,RestrictionsFactoryUtil.eq("description",new String("players")));
sportsQuery4.add(criterion2);

List<Sports> sportsList4 = SportsLocalServiceUtil.dynamicQuery(sportsQuery4);

for(Sports sports : sportsList4){
	out.println(sports.getSportsName() + sports.getSportsId()+ "<br/>");
}
%>

<h4>.............................................</h4>
<h4>Junction for AND </h4>
<%
DynamicQuery dynamicQueryJunction = DynamicQueryFactoryUtil.forClass(Sports.class, PortalClassLoaderUtil.getClassLoader());
Junction andJunction = RestrictionsFactoryUtil.conjunction();
Property property = PropertyFactoryUtil.forName("sportsName");
andJunction.add(property.eq("football"));

property = PropertyFactoryUtil.forName("description");
andJunction.add(property.eq("asdf"));

dynamicQueryJunction.add(andJunction);
List<Sports> sportsList5 = SportsLocalServiceUtil.dynamicQuery(dynamicQueryJunction);
for(Sports sports : sportsList5){
	out.println(sports.getSportsName() + "<br/>");
}
%>


<h4>.............................................</h4>
<h4>Junction for OR </h4>

<%
DynamicQuery dynamicQueryJunctionOr = DynamicQueryFactoryUtil.forClass(Sports.class, PortalClassLoaderUtil.getClassLoader());
		Junction orJunction = RestrictionsFactoryUtil.disjunction();
		
		Property property1 = PropertyFactoryUtil.forName("sportsName");
		orJunction.add(property.eq("football"));
		
		property1 = PropertyFactoryUtil.forName("description");
		orJunction.add(property1.eq("ball"));
		dynamicQueryJunctionOr.add(orJunction);
		
		List<Sports> sportsList6 = SportsLocalServiceUtil.dynamicQuery(dynamicQueryJunction);
		for(Sports sports : sportsList6){
			out.println(sports.getSportsName() + "<br/>");
		}
		
%>
