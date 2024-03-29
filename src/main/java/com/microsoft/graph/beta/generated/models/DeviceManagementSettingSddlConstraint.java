package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Constraint enforcing the setting is well formed SDDL
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettingSddlConstraint extends DeviceManagementConstraint implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementSettingSddlConstraint} and sets the default values.
     */
    public DeviceManagementSettingSddlConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingSddlConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementSettingSddlConstraint}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingSddlConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingSddlConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
