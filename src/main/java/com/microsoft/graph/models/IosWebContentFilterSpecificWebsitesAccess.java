package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosWebContentFilterSpecificWebsitesAccess extends IosWebContentFilterBase implements Parsable {
    /** URL bookmarks which will be installed into built-in browser and user is only allowed to access websites through bookmarks. This collection can contain a maximum of 500 elements. */
    private java.util.List<IosBookmark> _specificWebsitesOnly;
    /** URL bookmarks which will be installed into built-in browser and user is only allowed to access websites through bookmarks. This collection can contain a maximum of 500 elements. */
    private java.util.List<IosBookmark> _websiteList;
    /**
     * Instantiates a new IosWebContentFilterSpecificWebsitesAccess and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosWebContentFilterSpecificWebsitesAccess() {
        super();
        this.setOdataType("#microsoft.graph.iosWebContentFilterSpecificWebsitesAccess");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosWebContentFilterSpecificWebsitesAccess
     */
    @javax.annotation.Nonnull
    public static IosWebContentFilterSpecificWebsitesAccess createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosWebContentFilterSpecificWebsitesAccess();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosWebContentFilterSpecificWebsitesAccess currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("specificWebsitesOnly", (n) -> { currentObject.setSpecificWebsitesOnly(n.getCollectionOfObjectValues(IosBookmark::createFromDiscriminatorValue)); });
        deserializerMap.put("websiteList", (n) -> { currentObject.setWebsiteList(n.getCollectionOfObjectValues(IosBookmark::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the specificWebsitesOnly property value. URL bookmarks which will be installed into built-in browser and user is only allowed to access websites through bookmarks. This collection can contain a maximum of 500 elements.
     * @return a iosBookmark
     */
    @javax.annotation.Nullable
    public java.util.List<IosBookmark> getSpecificWebsitesOnly() {
        return this._specificWebsitesOnly;
    }
    /**
     * Gets the websiteList property value. URL bookmarks which will be installed into built-in browser and user is only allowed to access websites through bookmarks. This collection can contain a maximum of 500 elements.
     * @return a iosBookmark
     */
    @javax.annotation.Nullable
    public java.util.List<IosBookmark> getWebsiteList() {
        return this._websiteList;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("specificWebsitesOnly", this.getSpecificWebsitesOnly());
        writer.writeCollectionOfObjectValues("websiteList", this.getWebsiteList());
    }
    /**
     * Sets the specificWebsitesOnly property value. URL bookmarks which will be installed into built-in browser and user is only allowed to access websites through bookmarks. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the specificWebsitesOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpecificWebsitesOnly(@javax.annotation.Nullable final java.util.List<IosBookmark> value) {
        this._specificWebsitesOnly = value;
    }
    /**
     * Sets the websiteList property value. URL bookmarks which will be installed into built-in browser and user is only allowed to access websites through bookmarks. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the websiteList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebsiteList(@javax.annotation.Nullable final java.util.List<IosBookmark> value) {
        this._websiteList = value;
    }
}
