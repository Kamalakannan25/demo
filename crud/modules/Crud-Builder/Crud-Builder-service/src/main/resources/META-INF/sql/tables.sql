create table Sports_Games (
	uuid_ VARCHAR(75) null,
	gamesId LONG not null primary key,
	gamessName VARCHAR(75) null,
	gamesAge INTEGER,
	Description VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table Sports_Sports (
	uuid_ VARCHAR(75) null,
	sportsId LONG not null primary key,
	sportsName VARCHAR(75) null,
	description VARCHAR(75) null
);