package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IsolateDeviceIncidentTaskResponseAction extends IncidentTaskResponseAction implements Parsable {
    /**
     * Instantiates a new {@link IsolateDeviceIncidentTaskResponseAction} and sets the default values.
     */
    public IsolateDeviceIncidentTaskResponseAction() {
        super();
        this.setOdataType("#microsoft.graph.security.isolateDeviceIncidentTaskResponseAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IsolateDeviceIncidentTaskResponseAction}
     */
    @jakarta.annotation.Nonnull
    public static IsolateDeviceIncidentTaskResponseAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IsolateDeviceIncidentTaskResponseAction();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isolationType", (n) -> { this.setIsolationType(n.getEnumValue(IsolationType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isolationType property value. The isolationType property
     * @return a {@link IsolationType}
     */
    @jakarta.annotation.Nullable
    public IsolationType getIsolationType() {
        return this.backingStore.get("isolationType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("isolationType", this.getIsolationType());
    }
    /**
     * Sets the isolationType property value. The isolationType property
     * @param value Value to set for the isolationType property.
     */
    public void setIsolationType(@jakarta.annotation.Nullable final IsolationType value) {
        this.backingStore.set("isolationType", value);
    }
}
