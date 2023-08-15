package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class containing the properties used for iOS lob app provisioning configuration PolicySetItem.
 */
public class IosLobAppProvisioningConfigurationPolicySetItem extends PolicySetItem implements Parsable {
    /**
     * Instantiates a new iosLobAppProvisioningConfigurationPolicySetItem and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public IosLobAppProvisioningConfigurationPolicySetItem() {
        super();
        this.setOdataType("#microsoft.graph.iosLobAppProvisioningConfigurationPolicySetItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosLobAppProvisioningConfigurationPolicySetItem
     */
    @jakarta.annotation.Nonnull
    public static IosLobAppProvisioningConfigurationPolicySetItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosLobAppProvisioningConfigurationPolicySetItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
