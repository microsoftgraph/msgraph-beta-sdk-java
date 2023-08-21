package com.microsoft.graph.models.industrydata;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IndustryDataActivity extends Entity implements Parsable {
    /**
     * The name of the activity. Maximum supported length is 100 characters.
     */
    private String displayName;
    /**
     * The readinessStatus property
     */
    private ReadinessStatus readinessStatus;
    /**
     * Instantiates a new industryDataActivity and sets the default values.
     */
    public IndustryDataActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a industryDataActivity
     */
    @jakarta.annotation.Nonnull
    public static IndustryDataActivity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.industryData.inboundFileFlow": return new InboundFileFlow();
                case "#microsoft.graph.industryData.inboundFlow": return new InboundFlow();
            }
        }
        return new IndustryDataActivity();
    }
    /**
     * Gets the displayName property value. The name of the activity. Maximum supported length is 100 characters.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("readinessStatus", (n) -> { this.setReadinessStatus(n.getEnumValue(ReadinessStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the readinessStatus property value. The readinessStatus property
     * @return a readinessStatus
     */
    @jakarta.annotation.Nullable
    public ReadinessStatus getReadinessStatus() {
        return this.readinessStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("readinessStatus", this.getReadinessStatus());
    }
    /**
     * Sets the displayName property value. The name of the activity. Maximum supported length is 100 characters.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the readinessStatus property value. The readinessStatus property
     * @param value Value to set for the readinessStatus property.
     */
    public void setReadinessStatus(@jakarta.annotation.Nullable final ReadinessStatus value) {
        this.readinessStatus = value;
    }
}
