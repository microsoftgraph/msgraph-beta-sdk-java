package com.microsoft.graph.models.industrydata;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.PublicError;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IndustryDataRunActivity extends Entity implements Parsable {
    /** The flow that was run by this activity. */
    private IndustryDataActivity activity;
    /** An error object to diagnose critical failures in an activity. */
    private PublicError blockingError;
    /** The name of the running flow. */
    private String displayName;
    /** The status property */
    private IndustryDataActivityStatus status;
    /**
     * Instantiates a new IndustryDataRunActivity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IndustryDataRunActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IndustryDataRunActivity
     */
    @javax.annotation.Nonnull
    public static IndustryDataRunActivity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a industryDataActivity
     */
    @javax.annotation.Nullable
    public IndustryDataActivity getActivity() {
        return this.activity;
    }
    /**
     * Gets the blockingError property value. An error object to diagnose critical failures in an activity.
     * @return a publicError
     */
    @javax.annotation.Nullable
    public PublicError getBlockingError() {
        return this.blockingError;
    }
    /**
     * Gets the displayName property value. The name of the running flow.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getObjectValue(IndustryDataActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("blockingError", (n) -> { this.setBlockingError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(IndustryDataActivityStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the status property value. The status property
     * @return a industryDataActivityStatus
     */
    @javax.annotation.Nullable
    public IndustryDataActivityStatus getStatus() {
        return this.status;
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
        writer.writeObjectValue("activity", this.getActivity());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the activity property value. The flow that was run by this activity.
     * @param value Value to set for the activity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivity(@javax.annotation.Nullable final IndustryDataActivity value) {
        this.activity = value;
    }
    /**
     * Sets the blockingError property value. An error object to diagnose critical failures in an activity.
     * @param value Value to set for the blockingError property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockingError(@javax.annotation.Nullable final PublicError value) {
        this.blockingError = value;
    }
    /**
     * Sets the displayName property value. The name of the running flow.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final IndustryDataActivityStatus value) {
        this.status = value;
    }
}
