package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Experimental profile to increase the rate of device check-ins per day of iOS devices. This profile type is deprecated.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosExpeditedCheckinConfiguration extends AppleExpeditedCheckinConfigurationBase implements Parsable {
    /**
     * Instantiates a new {@link IosExpeditedCheckinConfiguration} and sets the default values.
     */
    public IosExpeditedCheckinConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosExpeditedCheckinConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IosExpeditedCheckinConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static IosExpeditedCheckinConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosExpeditedCheckinConfiguration();
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
