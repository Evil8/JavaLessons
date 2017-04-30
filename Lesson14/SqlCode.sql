--------------------------------
/*database*/
--------------------------------
use [master]
go

create database [SportGoodsRent]
containment = none
on primary
  (name = N'SportGoodsRent', filename = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER2012\MSSQL\DATA\SportGoodsRent.mdf', size = 4096 kb, maxsize = unlimited, filegrowth = 1024 kb)
log on
  (name = N'SportGoodsRent_log', filename = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER2012\MSSQL\DATA\SportGoodsRent_log.ldf', size = 1024 kb, maxsize = 2048 gb, filegrowth = 10%)
go

alter database [SportGoodsRent] set compatibility_level = 110
go

if (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
  begin
    exec [SportGoodsRent].[dbo].[sp_fulltext_database] @action = 'enable'
  end
go


-----------------------------
/*Customer*/
---------------
if object_id('dbo.getcustomer') is not null
  drop procedure dbo.getcustomer
go

set ansi_nulls on
go

set quoted_identifier on
go

create procedure dbo.getcustomer
  -- Add the parameters for the stored procedure here
    @id  int = null,
    @all bit
as
  begin
    -- SET NOCOUNT ON added to prevent extra result sets from
    -- interfering with SELECT statements.
    set nocount on;
    if (@all = 0 and @id is not null)
      begin
        select
          name,
          address,
          active
        from dbo.customers
        where @id = id
      end
    else
      begin
        select
          id,
          name,
          passportnumber,
          address,
          active
        from dbo.customers

      end
  end
go

if object_id('dbo.setcustomer') is not null
  drop procedure dbo.setcustomer
go

set ansi_nulls on
go

set quoted_identifier on
go

create procedure dbo.setcustomer
  -- Add the parameters for the stored procedure here
    @name           nvarchar(50),
    @passportnumber nvarchar(20),
    @address        nvarchar(500)

as
  begin
    -- SET NOCOUNT ON added to prevent extra result sets from
    -- interfering with SELECT statements.
    set nocount on;
    insert into dbo.customers (
      name, address, passportnumber
    )
      select
        @name,
        @address,
        @passportnumber

  end
go

if object_id('dbo.modifycustomer') is not null
  drop procedure dbo.modifycustomer
go

set ansi_nulls on
go

set quoted_identifier on
go

create procedure dbo.modifycustomer
  -- Add the parameters for the stored procedure here
    @id             int,
    @name           nvarchar(50) = null,
    @passportnumber nvarchar(20) = null,
    @address        nvarchar(100) = null,
    @active         bit = null
as
  begin
    -- SET NOCOUNT ON added to prevent extra result sets from
    -- interfering with SELECT statements.
    set nocount on;
    update dbo.customers
    set
      name           = coalesce(@name, name),
      address        = coalesce(@address, address),
      passportnumber = coalesce(@passportnumber, passportnumber),
      active         = coalesce(@active, active)
    where @id = id
  end
go
------------------------------------
/*SportGoods*/
------------------------------------
if object_id('dbo.getsportgoods') is not null
  drop procedure dbo.getsportgoods
go

set ansi_nulls on
go

set quoted_identifier on
go

create procedure dbo.getsportgoods
  -- Add the parameters for the stored procedure here
    @id  int = null,
    @all bit
as
  begin
    -- SET NOCOUNT ON added to prevent extra result sets from
    -- interfering with SELECT statements.
    set nocount on;
    if (@all = 0) and (@id is not null)
      begin
        select
          sportgoodname,
          priceperday,
          totalamount,
          [active]
        from dbo.sportgoods
        where @id = id
      end
    else
      begin
        select
          id,
          sportgoodname,
          priceperday,
          totalamount,
          [active]
        from dbo.sportgoods
      end
    -- Insert statements for procedure here
  end
go

if object_id('dbo.setsportgood') is not null
  drop procedure dbo.setsportgood
go

set ansi_nulls on
go

set quoted_identifier on
go

create procedure dbo.setsportgood
  -- Add the parameters for the stored procedure here
    @sportgoodsname nvarchar(100),
    @priceperday    numeric(5, 2),
    @totalamount    int
as
  begin
    -- SET NOCOUNT ON added to prevent extra result sets from
    -- interfering with SELECT statements.
    set nocount on;
    insert into dbo.sportgoods (
      sportgoodname, priceperday, totalamount
    )
      select
        @sportgoodsname,
        @priceperday,
        @totalamount

  end
go

if object_id('dbo.modifysportgood') is not null
  drop procedure dbo.modifysportgood
go

set ansi_nulls on
go

set quoted_identifier on
go

create procedure dbo.modifysportgood
  -- Add the parameters for the stored procedure here
    @id            int,
    @sportgoodname nvarchar(100) = null,
    @priceperday   numeric(5, 2) = null,
    @totalamount   int = null,
    @active        bit = null
as
  begin
    -- SET NOCOUNT ON added to prevent extra result sets from
    -- interfering with SELECT statements.
    set nocount on;
    update dbo.sportgoods
    set
      sportgoodname = coalesce(@sportgoodname, sportgoodname),
      priceperday   = coalesce(@priceperday, priceperday),
      totalamount   = coalesce(@totalamount, totalamount),
      active        = coalesce(@active, active)
    where @id = id
  end
go
-------------------------------
/*FactOrder*/
-------------------------------
if object_id('dbo.getfactorder') is not null
  drop procedure dbo.getfactorder
go

set ansi_nulls on
go

set quoted_identifier on
go

create procedure dbo.getfactorder
  -- Add the parameters for the stored procedure here
    @id  int = null,
    @all bit
as
  begin
    if (@all = 0 and @id is not null)
      begin
        select
          sportgoodid,
          customerid,
          totalsportgoodstaken,
          paid,
          closed,
          totaltopay,
          sportgoodtakendate,
          sportgoodreturndate
        from dbo.factorder
        where id = @id
      end
    else
      begin
        select
          id,
          sportgoodid,
          customerid,
          totalsportgoodstaken,
          paid,
          closed,
          totaltopay,
          sportgoodtakendate,
          sportgoodreturndate
        from dbo.factorder
      end
  end
go

if object_id('dbo.setfactorder') is not null
  drop procedure dbo.setfactorder
go

set ansi_nulls on
go

set quoted_identifier on
go

create procedure dbo.setfactorder
  -- Add the parameters for the stored procedure here
    @customerid           int,
    @sportgoodid          int,
    @sportgoodtakendate   datetime,
    @sportgoodreturndate  datetime,
    @totaltopay           numeric(10, 2),
    @paid                 bit,
    @totalsportgoodstaken int
as
  begin
    -- SET NOCOUNT ON added to prevent extra result sets from
    -- interfering with SELECT statements.
    set nocount on;
    insert into dbo.factorder (
      customerid, sportgoodid, sportgoodtakendate, sportgoodreturndate, totaltopay, paid, totalsportgoodstaken
    )
      select
        @customerid,
        @sportgoodid,
        @sportgoodtakendate,
        @sportgoodreturndate,
        @totaltopay,
        @paid,
        @totalsportgoodstaken


  end
go

if object_id('dbo.modifyfactorder') is not null
  drop procedure dbo.modifyfactorder
go

set ansi_nulls on
go

set quoted_identifier on
go

create procedure dbo.modifyfactorder
  -- Add the parameters for the stored procedure here
    @id                   int,
    @customerid           int = null,
    @sportgoodid          int = null,
    @sportgoodtakendate   datetime = null,
    @sportgoodreturndate  datetime = null,
    @totaltopay           numeric(10, 2) = null,
    @paid                 bit = null,
    @totalsportgoodstaken int = null,
    @closed               bit = null,
    @active               bit = null
as
  begin
    -- SET NOCOUNT ON added to prevent extra result sets from
    -- interfering with SELECT statements.
    set nocount on;

    update dbo.factorder
    set
      customerid           = coalesce(@customerid, customerid),
      sportgoodid          = coalesce(@sportgoodid, sportgoodid),
      sportgoodtakendate   = coalesce(@sportgoodtakendate, sportgoodtakendate),
      sportgoodreturndate  = coalesce(@sportgoodreturndate, sportgoodreturndate),
      totaltopay           = coalesce(@totaltopay, totaltopay),
      paid                 = coalesce(@paid, paid),
      totalsportgoodstaken = coalesce(@totalsportgoodstaken, totalsportgoodstaken),
      closed               = coalesce(@closed, closed),
      active               = coalesce(@active, active)
    where @id = id

  end
go


set ansi_nulls on
go
set quoted_identifier on
go

create trigger dbo.totaltopaycalculation
  on [dbo].[FactOrder]
after insert, update
as
  begin
    -- SET NOCOUNT ON added to prevent extra result sets from
    -- interfering with SELECT statements.
    set nocount on;

    update fo
    set totaltopay = priceperday * datediff(dd, i.sportgoodtakendate, i.sportgoodreturndate)
    from inserted i
      join dbo.factorder fo
        on i.id = fo.id
      join dbo.sportgoods sg
        on fo.sportgoodid = sg.id

    update sg
    set sg.totalamount = totalamount - i.totalsportgoodstaken
    from inserted i
      join dbo.sportgoods sg
        on i.sportgoodid = sg.id

  end
go
