package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsIdentitySource extends PermissionsDefinitionIdentitySource implements Parsable {
    /**
     * Instantiates a new AwsIdentitySource and sets the default values.
     */
    public AwsIdentitySource() {
        super();
        this.setOdataType("#microsoft.graph.awsIdentitySource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsIdentitySource
     */
    @jakarta.annotation.Nonnull
    public static AwsIdentitySource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsIdentitySource();
    }
    /**
     * Gets the authorizationSystemInfo property value. The authorizationSystemInfo property
     * @return a PermissionsDefinitionAuthorizationSystem
     */
    @jakarta.annotation.Nullable
    public PermissionsDefinitionAuthorizationSystem getAuthorizationSystemInfo() {
        return this.backingStore.get("authorizationSystemInfo");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authorizationSystemInfo", (n) -> { this.setAuthorizationSystemInfo(n.getObjectValue(PermissionsDefinitionAuthorizationSystem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("authorizationSystemInfo", this.getAuthorizationSystemInfo());
    }
    /**
     * Sets the authorizationSystemInfo property value. The authorizationSystemInfo property
     * @param value Value to set for the authorizationSystemInfo property.
     */
    public void setAuthorizationSystemInfo(@jakarta.annotation.Nullable final PermissionsDefinitionAuthorizationSystem value) {
        this.backingStore.set("authorizationSystemInfo", value);
    }
}
