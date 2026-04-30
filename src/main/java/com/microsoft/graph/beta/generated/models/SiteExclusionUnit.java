package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SiteExclusionUnit extends ExclusionUnitBase implements Parsable {
    /**
     * Instantiates a new {@link SiteExclusionUnit} and sets the default values.
     */
    public SiteExclusionUnit() {
        super();
        this.setOdataType("#microsoft.graph.siteExclusionUnit");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SiteExclusionUnit}
     */
    @jakarta.annotation.Nonnull
    public static SiteExclusionUnit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SiteExclusionUnit();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("siteId", (n) -> { this.setSiteId(n.getStringValue()); });
        deserializerMap.put("siteName", (n) -> { this.setSiteName(n.getStringValue()); });
        deserializerMap.put("siteWebUrl", (n) -> { this.setSiteWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the siteId property value. The siteId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSiteId() {
        return this.backingStore.get("siteId");
    }
    /**
     * Gets the siteName property value. The siteName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSiteName() {
        return this.backingStore.get("siteName");
    }
    /**
     * Gets the siteWebUrl property value. The siteWebUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSiteWebUrl() {
        return this.backingStore.get("siteWebUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("siteId", this.getSiteId());
    }
    /**
     * Sets the siteId property value. The siteId property
     * @param value Value to set for the siteId property.
     */
    public void setSiteId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteId", value);
    }
    /**
     * Sets the siteName property value. The siteName property
     * @param value Value to set for the siteName property.
     */
    public void setSiteName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteName", value);
    }
    /**
     * Sets the siteWebUrl property value. The siteWebUrl property
     * @param value Value to set for the siteWebUrl property.
     */
    public void setSiteWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteWebUrl", value);
    }
}
