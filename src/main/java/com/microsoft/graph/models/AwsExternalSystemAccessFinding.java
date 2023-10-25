package com.microsoft.graph.models;

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
     * The accessMethods property
     */
    private EnumSet<ExternalSystemAccessMethods> accessMethods;
    /**
     * The affectedSystem property
     */
    private AuthorizationSystem affectedSystem;
    /**
     * The systemWithAccess property
     */
    private AuthorizationSystemInfo systemWithAccess;
    /**
     * The trustedIdentityCount property
     */
    private Integer trustedIdentityCount;
    /**
     * The trustsAllIdentities property
     */
    private Boolean trustsAllIdentities;
    /**
     * Instantiates a new AwsExternalSystemAccessFinding and sets the default values.
     */
    public AwsExternalSystemAccessFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsExternalSystemAccessFinding
     */
    @jakarta.annotation.Nonnull
    public static AwsExternalSystemAccessFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsExternalSystemAccessFinding();
    }
    /**
     * Gets the accessMethods property value. The accessMethods property
     * @return a EnumSet<ExternalSystemAccessMethods>
     */
    @jakarta.annotation.Nullable
    public EnumSet<ExternalSystemAccessMethods> getAccessMethods() {
        return this.accessMethods;
    }
    /**
     * Gets the affectedSystem property value. The affectedSystem property
     * @return a AuthorizationSystem
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystem getAffectedSystem() {
        return this.affectedSystem;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessMethods", (n) -> { this.setAccessMethods(n.getEnumSetValue(ExternalSystemAccessMethods.class)); });
        deserializerMap.put("affectedSystem", (n) -> { this.setAffectedSystem(n.getObjectValue(AuthorizationSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("systemWithAccess", (n) -> { this.setSystemWithAccess(n.getObjectValue(AuthorizationSystemInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("trustedIdentityCount", (n) -> { this.setTrustedIdentityCount(n.getIntegerValue()); });
        deserializerMap.put("trustsAllIdentities", (n) -> { this.setTrustsAllIdentities(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the systemWithAccess property value. The systemWithAccess property
     * @return a AuthorizationSystemInfo
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemInfo getSystemWithAccess() {
        return this.systemWithAccess;
    }
    /**
     * Gets the trustedIdentityCount property value. The trustedIdentityCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTrustedIdentityCount() {
        return this.trustedIdentityCount;
    }
    /**
     * Gets the trustsAllIdentities property value. The trustsAllIdentities property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTrustsAllIdentities() {
        return this.trustsAllIdentities;
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
        this.accessMethods = value;
    }
    /**
     * Sets the affectedSystem property value. The affectedSystem property
     * @param value Value to set for the affectedSystem property.
     */
    public void setAffectedSystem(@jakarta.annotation.Nullable final AuthorizationSystem value) {
        this.affectedSystem = value;
    }
    /**
     * Sets the systemWithAccess property value. The systemWithAccess property
     * @param value Value to set for the systemWithAccess property.
     */
    public void setSystemWithAccess(@jakarta.annotation.Nullable final AuthorizationSystemInfo value) {
        this.systemWithAccess = value;
    }
    /**
     * Sets the trustedIdentityCount property value. The trustedIdentityCount property
     * @param value Value to set for the trustedIdentityCount property.
     */
    public void setTrustedIdentityCount(@jakarta.annotation.Nullable final Integer value) {
        this.trustedIdentityCount = value;
    }
    /**
     * Sets the trustsAllIdentities property value. The trustsAllIdentities property
     * @param value Value to set for the trustsAllIdentities property.
     */
    public void setTrustsAllIdentities(@jakarta.annotation.Nullable final Boolean value) {
        this.trustsAllIdentities = value;
    }
}
