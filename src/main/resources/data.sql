INSERT INTO public.usuario (
userid, name, identification, phone) VALUES (
'1'::integer, 'Farid Saad'::character varying(255), '12345679'::character varying(255), '987654321'::character varying(255))
 returning userid;
INSERT INTO public.usuario (
userid, name, identification, phone) VALUES (
'2'::integer, 'Carlos Ceballos'::character varying(255), '852456'::character varying(255), '74123698'::character varying(255))
 returning userid;
COMMIT;
