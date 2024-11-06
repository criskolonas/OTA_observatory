create or replace view greece_areas_view as

select ROW_NUMBER() OVER () AS id, pr.* from (

select p.region_id as "region_id", p.id as "prefecture_id", p.name_gr as "name", 'PREFECTURE' as "type" from prefecture p
union all
select r.id as "region_id", null as "prefecture_id", r."name" as "name", 'REGION' as "type" from region r ) as pr;
