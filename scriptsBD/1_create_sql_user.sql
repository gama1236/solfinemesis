CREATE ROLE solfinemesis WITH
    LOGIN
    NOSUPERUSER
    INHERIT
    NOCREATEDB
    NOCREATEROLE
    NOREPLICATION
    PASSWORD 'solfinemesis';

GRANT postgres TO solfinemesis;