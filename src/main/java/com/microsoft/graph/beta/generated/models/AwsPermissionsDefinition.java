package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsPermissionsDefinition extends PermissionsDefinition implements Parsable {
    /**
     * Instantiates a new AwsPermissionsDefinition and sets the default values.
     */
    public AwsPermissionsDefinition() {
        super();
        this.setOdataType("#microsoft.graph.awsPermissionsDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsPermissionsDefinition
     */
    @jakarta.annotation.Nonnull
    public static AwsPermissionsDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsPermissionsDefinition();
    }
    /**
     * Gets the actionInfo property value. The actionInfo property
     * @return a AwsPermissionsDefinitionAction
     */
    @jakarta.annotation.Nullable
    public AwsPermissionsDefinitionAction getActionInfo() {
        return this.backingStore.get("actionInfo");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionInfo", (n) -> { this.setActionInfo(n.getObjectValue(AwsPermissionsDefinitionAction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("actionInfo", this.getActionInfo());
    }
    /**
     * Sets the actionInfo property value. The actionInfo property
     * @param value Value to set for the actionInfo property.
     */
    public void setActionInfo(@jakarta.annotation.Nullable final AwsPermissionsDefinitionAction value) {
        this.backingStore.set("actionInfo", value);
    }
}
