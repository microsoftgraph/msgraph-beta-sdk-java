package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.graph.beta.models.PublicError;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IndustryDataRunActivity extends Entity implements Parsable {
    /**
     * Instantiates a new IndustryDataRunActivity and sets the default values.
     */
    public IndustryDataRunActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IndustryDataRunActivity
     */
    @jakarta.annotation.Nonnull
    public static IndustryDataRunActivity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.industryData.inboundFlowActivity": return new InboundFlowActivity();
                case "#microsoft.graph.industryData.outboundFlowActivity": return new OutboundFlowActivity();
            }
        }
        return new IndustryDataRunActivity();
    }
    /**
     * Gets the activity property value. The flow that was run by this activity.
     * @return a IndustryDataActivity
     */
    @jakarta.annotation.Nullable
    public IndustryDataActivity getActivity() {
        return this.backingStore.get("activity");
    }
    /**
     * Gets the blockingError property value. An error object to diagnose critical failures in an activity.
     * @return a PublicError
     */
    @jakarta.annotation.Nullable
    public PublicError getBlockingError() {
        return this.backingStore.get("blockingError");
    }
    /**
     * Gets the displayName property value. The name of the running flow.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getObjectValue(IndustryDataActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("blockingError", (n) -> { this.setBlockingError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(IndustryDataActivityStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the status property value. The status property
     * @return a IndustryDataActivityStatus
     */
    @jakarta.annotation.Nullable
    public IndustryDataActivityStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("activity", this.getActivity());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the activity property value. The flow that was run by this activity.
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final IndustryDataActivity value) {
        this.backingStore.set("activity", value);
    }
    /**
     * Sets the blockingError property value. An error object to diagnose critical failures in an activity.
     * @param value Value to set for the blockingError property.
     */
    public void setBlockingError(@jakarta.annotation.Nullable final PublicError value) {
        this.backingStore.set("blockingError", value);
    }
    /**
     * Sets the displayName property value. The name of the running flow.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final IndustryDataActivityStatus value) {
        this.backingStore.set("status", value);
    }
}
