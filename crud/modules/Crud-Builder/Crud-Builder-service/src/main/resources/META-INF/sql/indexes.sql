create index IX_15B13BBB on Sports_Games (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_703B74FD on Sports_Games (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E159BB63 on Sports_Sports (sportsName[$COLUMN_LENGTH:75$]);
create index IX_E72655CF on Sports_Sports (uuid_[$COLUMN_LENGTH:75$]);