create table Sports_Games (
	uuid_ VARCHAR(75) null,
	gamesId LONG not null primary key,
	gameRules VARCHAR(75) null,
	gameMembers INTEGER,
	Description VARCHAR(75) null,
	sportsId LONG,
	playersId LONG
);

create table Sports_Players (
	uuid_ VARCHAR(75) null,
	playersId LONG not null primary key,
	playersName VARCHAR(75) null,
	playersAge INTEGER,
	Description VARCHAR(75) null,
	sportsId LONG
);

create table Sports_Sports (
	uuid_ VARCHAR(75) null,
	sportsId LONG not null primary key,
	sportsName VARCHAR(75) null,
	description VARCHAR(75) null
);