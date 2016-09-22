package eckel.listings.innerclasses;

/**
 * Created by Andriana on 22.09.2016.
 */
public class UsingParsel {
    public void doing()

    {
        Parcel2 p = new Parcel2();
        Parcel2.Contents con = p.new Contents();

        Parcel2.Contents c = new Parcel2().new Contents();
    }
    public static void dostatic(){
        Parcel2 ps = new Parcel2();
        Parcel2.Contents cs = ps.new Contents();

        Parcel2.Contents contents = new Parcel2().new Contents();
    }
}
