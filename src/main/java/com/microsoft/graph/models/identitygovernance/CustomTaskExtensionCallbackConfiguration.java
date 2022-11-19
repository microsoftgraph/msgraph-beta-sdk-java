package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.CustomExtensionCallbackConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomTaskExtensionCallbackConfiguration extends CustomExtensionCallbackConfiguration implements Parsable {
    /**
     * Instantiates a new CustomTaskExtensionCallbackConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CustomTaskExtensionCallbackConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.customTaskExtensionCallbackConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CustomTaskExtensionCallbackConfiguration
     */
    @javax.annotation.Nonnull
    public static CustomTaskExtensionCallbackConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomTaskExtensionCallbackConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CustomTaskExtensionCallbackConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
