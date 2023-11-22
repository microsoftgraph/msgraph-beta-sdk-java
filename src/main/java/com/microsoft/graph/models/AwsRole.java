package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsRole extends AwsIdentity implements Parsable {
    /**
     * Instantiates a new AwsRole and sets the default values.
     */
    public AwsRole() {
        super();
        this.setOdataType("#microsoft.graph.awsRole");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsRole
     */
    @jakarta.annotation.Nonnull
    public static AwsRole createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsRole();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("roleType", (n) -> { this.setRoleType(n.getEnumValue(AwsRoleType::forValue)); });
        deserializerMap.put("trustEntityType", (n) -> { this.setTrustEntityType(n.getEnumSetValue(AwsRoleTrustEntityType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the roleType property value. The roleType property
     * @return a AwsRoleType
     */
    @jakarta.annotation.Nullable
    public AwsRoleType getRoleType() {
        return this.backingStore.get("roleType");
    }
    /**
     * Gets the trustEntityType property value. The trustEntityType property
     * @return a EnumSet<AwsRoleTrustEntityType>
     */
    @jakarta.annotation.Nullable
    public EnumSet<AwsRoleTrustEntityType> getTrustEntityType() {
        return this.backingStore.get("trustEntityType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("roleType", this.getRoleType());
        writer.writeEnumSetValue("trustEntityType", this.getTrustEntityType());
    }
    /**
     * Sets the roleType property value. The roleType property
     * @param value Value to set for the roleType property.
     */
    public void setRoleType(@jakarta.annotation.Nullable final AwsRoleType value) {
        this.backingStore.set("roleType", value);
    }
    /**
     * Sets the trustEntityType property value. The trustEntityType property
     * @param value Value to set for the trustEntityType property.
     */
    public void setTrustEntityType(@jakarta.annotation.Nullable final EnumSet<AwsRoleTrustEntityType> value) {
        this.backingStore.set("trustEntityType", value);
    }
}
