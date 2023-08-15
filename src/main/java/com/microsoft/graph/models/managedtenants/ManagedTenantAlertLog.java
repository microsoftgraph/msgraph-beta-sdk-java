package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedTenantAlertLog extends Entity implements Parsable {
    /**
     * The alert property
     */
    private ManagedTenantAlert alert;
    /**
     * The content property
     */
    private AlertLogContent content;
    /**
     * The createdByUserId property
     */
    private String createdByUserId;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The lastActionByUserId property
     */
    private String lastActionByUserId;
    /**
     * The lastActionDateTime property
     */
    private OffsetDateTime lastActionDateTime;
    /**
     * Instantiates a new managedTenantAlertLog and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ManagedTenantAlertLog() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedTenantAlertLog
     */
    @jakarta.annotation.Nonnull
    public static ManagedTenantAlertLog createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedTenantAlertLog();
    }
    /**
     * Gets the alert property value. The alert property
     * @return a managedTenantAlert
     */
    @jakarta.annotation.Nullable
    public ManagedTenantAlert getAlert() {
        return this.alert;
    }
    /**
     * Gets the content property value. The content property
     * @return a alertLogContent
     */
    @jakarta.annotation.Nullable
    public AlertLogContent getContent() {
        return this.content;
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCreatedByUserId() {
        return this.createdByUserId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alert", (n) -> { this.setAlert(n.getObjectValue(ManagedTenantAlert::createFromDiscriminatorValue)); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getObjectValue(AlertLogContent::createFromDiscriminatorValue)); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActionByUserId property value. The lastActionByUserId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLastActionByUserId() {
        return this.lastActionByUserId;
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("alert", this.getAlert());
        writer.writeObjectValue("content", this.getContent());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
    }
    /**
     * Sets the alert property value. The alert property
     * @param value Value to set for the alert property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAlert(@jakarta.annotation.Nullable final ManagedTenantAlert value) {
        this.alert = value;
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setContent(@jakarta.annotation.Nullable final AlertLogContent value) {
        this.content = value;
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastActionByUserId(@jakarta.annotation.Nullable final String value) {
        this.lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastActionDateTime = value;
    }
}
