package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DlpEvaluationWindowsDevicesInput extends DlpEvaluationInput implements Parsable {
    /**
     * Instantiates a new {@link DlpEvaluationWindowsDevicesInput} and sets the default values.
     */
    public DlpEvaluationWindowsDevicesInput() {
        super();
        this.setOdataType("#microsoft.graph.dlpEvaluationWindowsDevicesInput");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DlpEvaluationWindowsDevicesInput}
     */
    @jakarta.annotation.Nonnull
    public static DlpEvaluationWindowsDevicesInput createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DlpEvaluationWindowsDevicesInput();
    }
    /**
     * Gets the contentProperties property value. The contentProperties property
     * @return a {@link ContentProperties}
     */
    @jakarta.annotation.Nullable
    public ContentProperties getContentProperties() {
        return this.backingStore.get("contentProperties");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentProperties", (n) -> { this.setContentProperties(n.getObjectValue(ContentProperties::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedBy", (n) -> { this.setSharedBy(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sharedBy property value. The sharedBy property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSharedBy() {
        return this.backingStore.get("sharedBy");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("contentProperties", this.getContentProperties());
        writer.writeStringValue("sharedBy", this.getSharedBy());
    }
    /**
     * Sets the contentProperties property value. The contentProperties property
     * @param value Value to set for the contentProperties property.
     */
    public void setContentProperties(@jakarta.annotation.Nullable final ContentProperties value) {
        this.backingStore.set("contentProperties", value);
    }
    /**
     * Sets the sharedBy property value. The sharedBy property
     * @param value Value to set for the sharedBy property.
     */
    public void setSharedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sharedBy", value);
    }
}
