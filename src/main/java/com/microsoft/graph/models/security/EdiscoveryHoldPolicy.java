package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoveryHoldPolicy extends PolicyBase implements Parsable {
    /**
     * Instantiates a new EdiscoveryHoldPolicy and sets the default values.
     */
    public EdiscoveryHoldPolicy() {
        super();
        this.setOdataType("#microsoft.graph.security.ediscoveryHoldPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdiscoveryHoldPolicy
     */
    @jakarta.annotation.Nonnull
    public static EdiscoveryHoldPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryHoldPolicy();
    }
    /**
     * Gets the contentQuery property value. KQL query that specifies content to be held in the specified locations. To learn more, see Keyword queries and search conditions for Content Search and eDiscovery.  To hold all content in the specified locations, leave contentQuery blank.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentQuery() {
        return this.backingStore.get("contentQuery");
    }
    /**
     * Gets the errors property value. Lists any errors that happened while placing the hold.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getErrors() {
        return this.backingStore.get("errors");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentQuery", (n) -> { this.setContentQuery(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("siteSources", (n) -> { this.setSiteSources(n.getCollectionOfObjectValues(SiteSource::createFromDiscriminatorValue)); });
        deserializerMap.put("userSources", (n) -> { this.setUserSources(n.getCollectionOfObjectValues(UserSource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the hold is enabled and actively holding content.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the siteSources property value. Data sources that represent SharePoint sites.
     * @return a java.util.List<SiteSource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SiteSource> getSiteSources() {
        return this.backingStore.get("siteSources");
    }
    /**
     * Gets the userSources property value. Data sources that represent Exchange mailboxes.
     * @return a java.util.List<UserSource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserSource> getUserSources() {
        return this.backingStore.get("userSources");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("contentQuery", this.getContentQuery());
        writer.writeCollectionOfPrimitiveValues("errors", this.getErrors());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeCollectionOfObjectValues("siteSources", this.getSiteSources());
        writer.writeCollectionOfObjectValues("userSources", this.getUserSources());
    }
    /**
     * Sets the contentQuery property value. KQL query that specifies content to be held in the specified locations. To learn more, see Keyword queries and search conditions for Content Search and eDiscovery.  To hold all content in the specified locations, leave contentQuery blank.
     * @param value Value to set for the contentQuery property.
     */
    public void setContentQuery(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentQuery", value);
    }
    /**
     * Sets the errors property value. Lists any errors that happened while placing the hold.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("errors", value);
    }
    /**
     * Sets the isEnabled property value. Indicates whether the hold is enabled and actively holding content.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the siteSources property value. Data sources that represent SharePoint sites.
     * @param value Value to set for the siteSources property.
     */
    public void setSiteSources(@jakarta.annotation.Nullable final java.util.List<SiteSource> value) {
        this.backingStore.set("siteSources", value);
    }
    /**
     * Sets the userSources property value. Data sources that represent Exchange mailboxes.
     * @param value Value to set for the userSources property.
     */
    public void setUserSources(@jakarta.annotation.Nullable final java.util.List<UserSource> value) {
        this.backingStore.set("userSources", value);
    }
}
