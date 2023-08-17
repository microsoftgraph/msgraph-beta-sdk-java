package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an iOS Web Content Filter setting type, which installs URL bookmarks into iOS built-in browser. An example scenario is in the classroom where teachers would like the students to navigate websites through browser bookmarks configured on their iOS devices, and no access to other sites.
 */
public class IosWebContentFilterSpecificWebsitesAccess extends IosWebContentFilterBase implements Parsable {
    /**
     * URL bookmarks which will be installed into built-in browser and user is only allowed to access websites through bookmarks. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<IosBookmark> specificWebsitesOnly;
    /**
     * URL bookmarks which will be installed into built-in browser and user is only allowed to access websites through bookmarks. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<IosBookmark> websiteList;
    /**
     * Instantiates a new iosWebContentFilterSpecificWebsitesAccess and sets the default values.
     */
    public IosWebContentFilterSpecificWebsitesAccess() {
        super();
        this.setOdataType("#microsoft.graph.iosWebContentFilterSpecificWebsitesAccess");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosWebContentFilterSpecificWebsitesAccess
     */
    @jakarta.annotation.Nonnull
    public static IosWebContentFilterSpecificWebsitesAccess createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosWebContentFilterSpecificWebsitesAccess();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("specificWebsitesOnly", (n) -> { this.setSpecificWebsitesOnly(n.getCollectionOfObjectValues(IosBookmark::createFromDiscriminatorValue)); });
        deserializerMap.put("websiteList", (n) -> { this.setWebsiteList(n.getCollectionOfObjectValues(IosBookmark::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the specificWebsitesOnly property value. URL bookmarks which will be installed into built-in browser and user is only allowed to access websites through bookmarks. This collection can contain a maximum of 500 elements.
     * @return a iosBookmark
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosBookmark> getSpecificWebsitesOnly() {
        return this.specificWebsitesOnly;
    }
    /**
     * Gets the websiteList property value. URL bookmarks which will be installed into built-in browser and user is only allowed to access websites through bookmarks. This collection can contain a maximum of 500 elements.
     * @return a iosBookmark
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosBookmark> getWebsiteList() {
        return this.websiteList;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("specificWebsitesOnly", this.getSpecificWebsitesOnly());
        writer.writeCollectionOfObjectValues("websiteList", this.getWebsiteList());
    }
    /**
     * Sets the specificWebsitesOnly property value. URL bookmarks which will be installed into built-in browser and user is only allowed to access websites through bookmarks. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the specificWebsitesOnly property.
     */
    public void setSpecificWebsitesOnly(@jakarta.annotation.Nullable final java.util.List<IosBookmark> value) {
        this.specificWebsitesOnly = value;
    }
    /**
     * Sets the websiteList property value. URL bookmarks which will be installed into built-in browser and user is only allowed to access websites through bookmarks. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the websiteList property.
     */
    public void setWebsiteList(@jakarta.annotation.Nullable final java.util.List<IosBookmark> value) {
        this.websiteList = value;
    }
}
