package com.example.stroe.tourguidecluj;

/**
 * {@link PointOfInterest} represents a location or city attraction that the user wants to learn about.
 * It contains methods that return the name of the attraction, address and description
 */
public class PointOfInterest {
    /** Name of the point of interest */
    private String mName;
    /** Adddress where that point of interest is located*/
    private String mAddress;
    /** Description of the point of interest*/
    private String mDescription;
    /** Id of the image resource*/
    private int mId;

    /**
     * Create a new Word object.
     *
     * @param name is nme of the point of interest
     * @param address is the address of the point of interest
     * @param description is the description of the point of interest
     * @param id is the id of the image resource
     */
    public PointOfInterest(String name, String address, String description, int id){
        mName = name;
        mAddress = address;
        mDescription = description;
        mId = id;
    }

    /** Create a PointOfInterest object without image
     *
     * @param name
     * @param address
     * @param description
     */
    public PointOfInterest(String name, String address, String description){
        mName = name;
        mAddress = address;
        mDescription = description;
    }

    /**
     * Get the name of the point of interest
     * @return mName
     */
    public String getName(){
        return mName;
    }

    /**
     * Get the address of the point of interest
     * @return mAddress
     */
    public String getAddress(){
        return mAddress;
    }

    /**
     * Get the description of the point of interest
     * @return mDescription
     */
    public String getDescription(){
        return mDescription;
    }

    /**
     * Get the description of the point of interest
     * @return mId
     */
    public int getImageResourceId(){
        return mId;
    }

}
