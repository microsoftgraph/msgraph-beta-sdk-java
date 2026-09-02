package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SapAssignmentRequestCallbackData extends CustomExtensionData implements Parsable {
    /**
     * Instantiates a new {@link SapAssignmentRequestCallbackData} and sets the default values.
     */
    public SapAssignmentRequestCallbackData() {
        super();
        this.setOdataType("#microsoft.graph.sapAssignmentRequestCallbackData");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SapAssignmentRequestCallbackData}
     */
    @jakarta.annotation.Nonnull
    public static SapAssignmentRequestCallbackData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SapAssignmentRequestCallbackData();
    }
    /**
     * Gets the detail property value. The detail property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetail() {
        return this.backingStore.get("detail");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("detail", (n) -> { this.setDetail(n.getStringValue()); });
        deserializerMap.put("requestNumber", (n) -> { this.setRequestNumber(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the requestNumber property value. The requestNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequestNumber() {
        return this.backingStore.get("requestNumber");
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("detail", this.getDetail());
        writer.writeStringValue("requestNumber", this.getRequestNumber());
        writer.writeStringValue("state", this.getState());
    }
    /**
     * Sets the detail property value. The detail property
     * @param value Value to set for the detail property.
     */
    public void setDetail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("detail", value);
    }
    /**
     * Sets the requestNumber property value. The requestNumber property
     * @param value Value to set for the requestNumber property.
     */
    public void setRequestNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestNumber", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("state", value);
    }
}
