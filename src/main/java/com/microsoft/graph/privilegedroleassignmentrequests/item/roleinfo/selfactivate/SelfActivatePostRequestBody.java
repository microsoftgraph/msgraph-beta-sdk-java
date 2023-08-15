package com.microsoft.graph.privilegedroleassignmentrequests.item.roleinfo.selfactivate;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SelfActivatePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The duration property
     */
    private String duration;
    /**
     * The reason property
     */
    private String reason;
    /**
     * The ticketNumber property
     */
    private String ticketNumber;
    /**
     * The ticketSystem property
     */
    private String ticketSystem;
    /**
     * Instantiates a new selfActivatePostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public SelfActivatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a selfActivatePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SelfActivatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SelfActivatePostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the duration property value. The duration property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDuration() {
        return this.duration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("ticketNumber", (n) -> { this.setTicketNumber(n.getStringValue()); });
        deserializerMap.put("ticketSystem", (n) -> { this.setTicketSystem(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reason property value. The reason property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the ticketNumber property value. The ticketNumber property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTicketNumber() {
        return this.ticketNumber;
    }
    /**
     * Gets the ticketSystem property value. The ticketSystem property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTicketSystem() {
        return this.ticketSystem;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("duration", this.getDuration());
        writer.writeStringValue("reason", this.getReason());
        writer.writeStringValue("ticketNumber", this.getTicketNumber());
        writer.writeStringValue("ticketSystem", this.getTicketSystem());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the duration property value. The duration property
     * @param value Value to set for the duration property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDuration(@jakarta.annotation.Nullable final String value) {
        this.duration = value;
    }
    /**
     * Sets the reason property value. The reason property
     * @param value Value to set for the reason property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the ticketNumber property value. The ticketNumber property
     * @param value Value to set for the ticketNumber property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTicketNumber(@jakarta.annotation.Nullable final String value) {
        this.ticketNumber = value;
    }
    /**
     * Sets the ticketSystem property value. The ticketSystem property
     * @param value Value to set for the ticketSystem property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTicketSystem(@jakarta.annotation.Nullable final String value) {
        this.ticketSystem = value;
    }
}
