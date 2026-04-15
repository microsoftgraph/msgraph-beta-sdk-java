package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessDriftReport extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessDriftReport} and sets the default values.
     */
    public AccessDriftReport() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessDriftReport}
     */
    @jakarta.annotation.Nonnull
    public static AccessDriftReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessDriftReport();
    }
    /**
     * Gets the downloadUri property value. The downloadUri property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDownloadUri() {
        return this.backingStore.get("downloadUri");
    }
    /**
     * Gets the expiresAt property value. The expiresAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiresAt() {
        return this.backingStore.get("expiresAt");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("downloadUri", (n) -> { this.setDownloadUri(n.getStringValue()); });
        deserializerMap.put("expiresAt", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getEnumValue(AccessDriftReportResourceType::forValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the resourceType property value. The resourceType property
     * @return a {@link AccessDriftReportResourceType}
     */
    @jakarta.annotation.Nullable
    public AccessDriftReportResourceType getResourceType() {
        return this.backingStore.get("resourceType");
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("downloadUri", this.getDownloadUri());
        writer.writeOffsetDateTimeValue("expiresAt", this.getExpiresAt());
        writer.writeEnumValue("resourceType", this.getResourceType());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the downloadUri property value. The downloadUri property
     * @param value Value to set for the downloadUri property.
     */
    public void setDownloadUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("downloadUri", value);
    }
    /**
     * Sets the expiresAt property value. The expiresAt property
     * @param value Value to set for the expiresAt property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expiresAt", value);
    }
    /**
     * Sets the resourceType property value. The resourceType property
     * @param value Value to set for the resourceType property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final AccessDriftReportResourceType value) {
        this.backingStore.set("resourceType", value);
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
}
