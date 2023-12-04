package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GcpRole extends Entity implements Parsable {
    /**
     * Instantiates a new GcpRole and sets the default values.
     */
    public GcpRole() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GcpRole
     */
    @jakarta.annotation.Nonnull
    public static GcpRole createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GcpRole();
    }
    /**
     * Gets the displayName property value. The name of the GCP role. Supports $filter and (eq,contains).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the externalId property value. The ID of the GCP role as defined by GCP. Alternate key.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("gcpRoleType", (n) -> { this.setGcpRoleType(n.getEnumValue(GcpRoleType::forValue)); });
        deserializerMap.put("scopes", (n) -> { this.setScopes(n.getCollectionOfObjectValues(GcpScope::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the gcpRoleType property value. The gcpRoleType property
     * @return a GcpRoleType
     */
    @jakarta.annotation.Nullable
    public GcpRoleType getGcpRoleType() {
        return this.backingStore.get("gcpRoleType");
    }
    /**
     * Gets the scopes property value. Resources that an identity assigned this GCP role can perform actions on. Supports $filter and (eq).
     * @return a java.util.List<GcpScope>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GcpScope> getScopes() {
        return this.backingStore.get("scopes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeEnumValue("gcpRoleType", this.getGcpRoleType());
        writer.writeCollectionOfObjectValues("scopes", this.getScopes());
    }
    /**
     * Sets the displayName property value. The name of the GCP role. Supports $filter and (eq,contains).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the externalId property value. The ID of the GCP role as defined by GCP. Alternate key.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
    /**
     * Sets the gcpRoleType property value. The gcpRoleType property
     * @param value Value to set for the gcpRoleType property.
     */
    public void setGcpRoleType(@jakarta.annotation.Nullable final GcpRoleType value) {
        this.backingStore.set("gcpRoleType", value);
    }
    /**
     * Sets the scopes property value. Resources that an identity assigned this GCP role can perform actions on. Supports $filter and (eq).
     * @param value Value to set for the scopes property.
     */
    public void setScopes(@jakarta.annotation.Nullable final java.util.List<GcpScope> value) {
        this.backingStore.set("scopes", value);
    }
}
