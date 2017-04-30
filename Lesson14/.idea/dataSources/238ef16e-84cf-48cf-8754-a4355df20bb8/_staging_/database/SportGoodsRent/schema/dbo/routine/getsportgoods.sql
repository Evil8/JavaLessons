create procedure dbo.getsportgoods
  -- Add the parameters for the stored procedure here
    @id     int = null,
    @active bit = null,
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
        where [active] = @active
      end
    -- Insert statements for procedure here
  end
go
