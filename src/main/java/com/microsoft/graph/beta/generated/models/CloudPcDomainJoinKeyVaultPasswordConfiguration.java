package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcDomainJoinKeyVaultPasswordConfiguration extends CloudPcDomainJoinKeyVaultIntentConfiguration implements Parsable {
    /**
     * Instantiates a new {@link CloudPcDomainJoinKeyVaultPasswordConfiguration} and sets the default values.
     */
    public CloudPcDomainJoinKeyVaultPasswordConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcDomainJoinKeyVaultPasswordConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcDomainJoinKeyVaultPasswordConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcDomainJoinKeyVaultPasswordConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcDomainJoinKeyVaultPasswordConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userIdentity", (n) -> { this.setUserIdentity(n.getObjectValue(CloudPcDomainJoinUserIdentity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the userIdentity property value. The userIdentity property
     * @return a {@link CloudPcDomainJoinUserIdentity}
     */
    @jakarta.annotation.Nullable
    public CloudPcDomainJoinUserIdentity getUserIdentity() {
        return this.backingStore.get("userIdentity");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("userIdentity", this.getUserIdentity());
    }
    /**
     * Sets the userIdentity property value. The userIdentity property
     * @param value Value to set for the userIdentity property.
     */
    public void setUserIdentity(@jakarta.annotation.Nullable final CloudPcDomainJoinUserIdentity value) {
        this.backingStore.set("userIdentity", value);
    }
}
