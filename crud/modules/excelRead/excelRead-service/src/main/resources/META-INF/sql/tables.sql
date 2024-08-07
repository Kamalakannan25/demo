create table excel_Excel (
	uuid_ VARCHAR(75) null,
	excelId LONG not null primary key,
	name VARCHAR(75) null,
	address VARCHAR(75) null,
	phoneNumber LONG
);

create table excel_Hospital (
	uuid_ VARCHAR(75) null,
	hospitalId LONG not null primary key,
	hospitalName VARCHAR(75) null,
	hospitalAddress VARCHAR(75) null,
	hospitalDetails VARCHAR(75) null
);

create table excel_Players (
	uuid_ VARCHAR(75) null,
	playersId LONG not null primary key,
	playersName VARCHAR(75) null,
	playersAge INTEGER,
	Description VARCHAR(75) null
);