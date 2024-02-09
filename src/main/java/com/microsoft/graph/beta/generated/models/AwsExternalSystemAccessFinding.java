package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsExternalSystemAccessFinding extends Finding implements Parsable {
    /**
     * Instantiates a new {@link AwsExternalSystemAccessFinding} and sets the default values.
     */
    public AwsExternalSystemAccessFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AwsExternalSystemAccessFinding}
     */
    @jakarta.annotation.Nonnull
    public static AwsExternalSystemAccessFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsExternalSystemAccessFinding();
    }
    /**
     * Gets the accessMethods property value. The accessMethods property
     * @return a {@link EnumSet<ExternalSystemAccessMethods>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ExternalSystemAccessMethods> getAccessMethods() {
        return this.backingStore.get("accessMethods");
    }
    /**
     * Gets the affectedSystem property value. The affectedSystem property
     * @return a {@link AuthorizationSystem}
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystem getAffectedSystem() {
        return this.backingStore.get("affectedSystem");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessMethods", (n) -> { this.setAccessMethods(n.getEnumSetValue(ExternalSystemAccessMethods::forValue)); });
        deserializerMap.put("affectedSystem", (n) -> { this.setAffectedSystem(n.getObjectValue(AuthorizationSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("systemWithAccess", (n) -> { this.setSystemWithAccess(n.getObjectValue(AuthorizationSystemInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("trustedIdentityCount", (n) -> { this.setTrustedIdentityCount(n.getIntegerValue()); });
        deserializerMap.put("trustsAllIdentities", (n) -> { this.setTrustsAllIdentities(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the systemWithAccess property value. The systemWithAccess property
     * @return a {@link AuthorizationSystemInfo}
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemInfo getSystemWithAccess() {
        return this.backingStore.get("systemWithAccess");
    }
    /**
     * Gets the trustedIdentityCount property value. The number of identities in the external system that are trusted, if not all. Supports $orderby.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTrustedIdentityCount() {
        return this.backingStore.get("trustedIdentityCount");
    }
    /**
     * Gets the trustsAllIdentities property value. Flag that determines if all identities in the external system are trusted, or only a subset.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTrustsAllIdentities() {
        return this.backingStore.get("trustsAllIdentities");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("accessMethods", this.getAccessMethods());
        writer.writeObjectValue("affectedSystem", this.getAffectedSystem());
        writer.writeObjectValue("systemWithAccess", this.getSystemWithAccess());
        writer.writeIntegerValue("trustedIdentityCount", this.getTrustedIdentityCount());
        writer.writeBooleanValue("trustsAllIdentities", this.getTrustsAllIdentities());
    }
    /**
     * Sets the accessMethods property value. The accessMethods property
     * @param value Value to set for the accessMethods property.
     */
    public void setAccessMethods(@jakarta.annotation.Nullable final EnumSet<ExternalSystemAccessMethods> value) {
        this.backingStore.set("accessMethods", value);
    }
    /**
     * Sets the affectedSystem property value. The affectedSystem property
     * @param value Value to set for the affectedSystem property.
     */
    public void setAffectedSystem(@jakarta.annotation.Nullable final AuthorizationSystem value) {
        this.backingStore.set("affectedSystem", value);
    }
    /**
     * Sets the systemWithAccess property value. The systemWithAccess property
     * @param value Value to set for the systemWithAccess property.
     */
    public void setSystemWithAccess(@jakarta.annotation.Nullable final AuthorizationSystemInfo value) {
        this.backingStore.set("systemWithAccess", value);
    }
    /**
     * Sets the trustedIdentityCount property value. The number of identities in the external system that are trusted, if not all. Supports $orderby.
     * @param value Value to set for the trustedIdentityCount property.
     */
    public void setTrustedIdentityCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("trustedIdentityCount", value);
    }
    /**
     * Sets the trustsAllIdentities property value. Flag that determines if all identities in the external system are trusted, or only a subset.
     * @param value Value to set for the trustsAllIdentities property.
     */
    public void setTrustsAllIdentities(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("trustsAllIdentities", value);
    }
}
