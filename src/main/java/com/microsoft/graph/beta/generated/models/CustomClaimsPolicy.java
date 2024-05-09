package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomClaimsPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CustomClaimsPolicy} and sets the default values.
     */
    public CustomClaimsPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomClaimsPolicy}
     */
    @jakarta.annotation.Nonnull
    public static CustomClaimsPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomClaimsPolicy();
    }
    /**
     * Gets the audienceOverride property value. The audienceOverride property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAudienceOverride() {
        return this.backingStore.get("audienceOverride");
    }
    /**
     * Gets the claims property value. The claims property
     * @return a {@link java.util.List<CustomClaimBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomClaimBase> getClaims() {
        return this.backingStore.get("claims");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("audienceOverride", (n) -> { this.setAudienceOverride(n.getStringValue()); });
        deserializerMap.put("claims", (n) -> { this.setClaims(n.getCollectionOfObjectValues(CustomClaimBase::createFromDiscriminatorValue)); });
        deserializerMap.put("includeApplicationIdInIssuer", (n) -> { this.setIncludeApplicationIdInIssuer(n.getBooleanValue()); });
        deserializerMap.put("includeBasicClaimSet", (n) -> { this.setIncludeBasicClaimSet(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeApplicationIdInIssuer property value. The includeApplicationIdInIssuer property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludeApplicationIdInIssuer() {
        return this.backingStore.get("includeApplicationIdInIssuer");
    }
    /**
     * Gets the includeBasicClaimSet property value. The includeBasicClaimSet property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludeBasicClaimSet() {
        return this.backingStore.get("includeBasicClaimSet");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("audienceOverride", this.getAudienceOverride());
        writer.writeCollectionOfObjectValues("claims", this.getClaims());
        writer.writeBooleanValue("includeApplicationIdInIssuer", this.getIncludeApplicationIdInIssuer());
        writer.writeBooleanValue("includeBasicClaimSet", this.getIncludeBasicClaimSet());
    }
    /**
     * Sets the audienceOverride property value. The audienceOverride property
     * @param value Value to set for the audienceOverride property.
     */
    public void setAudienceOverride(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("audienceOverride", value);
    }
    /**
     * Sets the claims property value. The claims property
     * @param value Value to set for the claims property.
     */
    public void setClaims(@jakarta.annotation.Nullable final java.util.List<CustomClaimBase> value) {
        this.backingStore.set("claims", value);
    }
    /**
     * Sets the includeApplicationIdInIssuer property value. The includeApplicationIdInIssuer property
     * @param value Value to set for the includeApplicationIdInIssuer property.
     */
    public void setIncludeApplicationIdInIssuer(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("includeApplicationIdInIssuer", value);
    }
    /**
     * Sets the includeBasicClaimSet property value. The includeBasicClaimSet property
     * @param value Value to set for the includeBasicClaimSet property.
     */
    public void setIncludeBasicClaimSet(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("includeBasicClaimSet", value);
    }
}
