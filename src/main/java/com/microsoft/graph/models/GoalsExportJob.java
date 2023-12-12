package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GoalsExportJob extends LongRunningOperation implements Parsable {
    /**
     * Instantiates a new GoalsExportJob and sets the default values.
     */
    public GoalsExportJob() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GoalsExportJob
     */
    @jakarta.annotation.Nonnull
    public static GoalsExportJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GoalsExportJob();
    }
    /**
     * Gets the content property value. The content of the goalsExportJob.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the expirationDateTime property value. The date and time of expiry of the result of the operation.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * Gets the explorerViewId property value. The unique identifier of the explorer view to be exported.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExplorerViewId() {
        return this.backingStore.get("explorerViewId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("explorerViewId", (n) -> { this.setExplorerViewId(n.getStringValue()); });
        deserializerMap.put("goalsOrganizationId", (n) -> { this.setGoalsOrganizationId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the goalsOrganizationId property value. The unique identifier of the viva goals organization.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGoalsOrganizationId() {
        return this.backingStore.get("goalsOrganizationId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("explorerViewId", this.getExplorerViewId());
        writer.writeStringValue("goalsOrganizationId", this.getGoalsOrganizationId());
    }
    /**
     * Sets the content property value. The content of the goalsExportJob.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the expirationDateTime property value. The date and time of expiry of the result of the operation.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the explorerViewId property value. The unique identifier of the explorer view to be exported.
     * @param value Value to set for the explorerViewId property.
     */
    public void setExplorerViewId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("explorerViewId", value);
    }
    /**
     * Sets the goalsOrganizationId property value. The unique identifier of the viva goals organization.
     * @param value Value to set for the goalsOrganizationId property.
     */
    public void setGoalsOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("goalsOrganizationId", value);
    }
}
