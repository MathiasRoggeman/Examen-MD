package be.ap.edu.examenmobile;

public class veloStationPojo {
        private String o_id;
        private String id;
        private String point_lng;
        private String status;
        private String orientatie;
        private String point_lat;
        private String shape;
        private String type;
        private String objectid;
        private String aantal_loc;
        private String naam;
        private String ligging;
        private String obj_type;




    public String getO_id ()
        {
            return o_id;
        }

        public void setO_id (String o_id)
        {
            this.o_id = o_id;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getPoint_lng ()
        {
            return point_lng;
        }

        public void setPoint_lng (String point_lng)
        {
            this.point_lng = point_lng;
        }

        public String getStatus ()
        {
            return status;
        }

        public void setStatus (String status)
        {
            this.status = status;
        }

        public String getOrientatie ()
        {
            return orientatie;
        }

        public void setOrientatie (String orientatie)
        {
            this.orientatie = orientatie;
        }

        public String getPoint_lat ()
        {
            return point_lat;
        }

        public void setPoint_lat (String point_lat)
        {
            this.point_lat = point_lat;
        }

        public String getShape ()
        {
            return shape;
        }

        public void setShape (String shape)
        {
            this.shape = shape;
        }

        public String getType ()
        {
            return type;
        }

        public void setType (String type)
        {
            this.type = type;
        }

        public String getObjectid ()
        {
            return objectid;
        }

        public void setObjectid (String objectid)
        {
            this.objectid = objectid;
        }

        public String getAantal_loc ()
        {
            return aantal_loc;
        }

        public void setAantal_loc (String aantal_loc)
        {
            this.aantal_loc = aantal_loc;
        }

        public String getNaam ()
        {
            return naam;
        }

        public void setNaam (String naam)
        {
            this.naam = naam;
        }

        public String getLigging ()
        {
            return ligging;
        }

        public void setLigging (String ligging)
        {
            this.ligging = ligging;
        }

        public String getObj_type ()
        {
            return obj_type;
        }

        public void setObj_type (String obj_type)
        {
            this.obj_type = obj_type;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [o_id = "+o_id+", id = "+id+", point_lng = "+point_lng+", status = "+status+", orientatie = "+orientatie+", point_lat = "+point_lat+", shape = "+shape+", type = "+type+", objectid = "+objectid+", aantal_loc = "+aantal_loc+", naam = "+naam+", ligging = "+ligging+", obj_type = "+obj_type+"]";
        }
    }