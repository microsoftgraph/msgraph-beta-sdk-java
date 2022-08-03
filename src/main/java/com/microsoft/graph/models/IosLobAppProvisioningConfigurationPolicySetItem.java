package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosLobAppProvisioningConfigurationPolicySetItem extends PolicySetItem implements Parsable {
    /**
     * Instantiates a new IosLobAppProvisioningConfigurationPolicySetItem and sets the default values.
     * @return a void
     */
    public IosLobAppProvisioningConfigurationPolicySetItem() {
        super();
        this.setOdataType("#microsoft.graph.iosLobAppProvisioningConfigurationPolicySetItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosLobAppProvisioningConfigurationPolicySetItem
     */
    @javax.annotation.Nonnull
    public static IosLobAppProvisioningConfigurationPolicySetItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosLobAppProvisioningConfigurationPolicySetItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosLobAppProvisioningConfigurationPolicySetItem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
