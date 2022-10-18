package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApplicationSignInDetailedSummary extends Entity implements Parsable {
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _aggregatedEventDateTime;
    /** Name of the application that the user signed in to. */
    private String _appDisplayName;
    /** ID of the application that the user signed in to. */
    private String _appId;
    /** Count of sign-ins made by the application. */
    private Long _signInCount;
    /** Details of the sign-in status. */
    private SignInStatus _status;
    /**
     * Instantiates a new ApplicationSignInDetailedSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApplicationSignInDetailedSummary() {
        super();
        this.setOdataType("#microsoft.graph.applicationSignInDetailedSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ApplicationSignInDetailedSummary
     */
    @javax.annotation.Nonnull
    public static ApplicationSignInDetailedSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationSignInDetailedSummary();
    }
    /**
     * Gets the aggregatedEventDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAggregatedEventDateTime() {
        return this._aggregatedEventDateTime;
    }
    /**
     * Gets the appDisplayName property value. Name of the application that the user signed in to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this._appDisplayName;
    }
    /**
     * Gets the appId property value. ID of the application that the user signed in to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ApplicationSignInDetailedSummary currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("aggregatedEventDateTime", (n) -> { currentObject.setAggregatedEventDateTime(n.getOffsetDateTimeValue()); });
            this.put("appDisplayName", (n) -> { currentObject.setAppDisplayName(n.getStringValue()); });
            this.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
            this.put("signInCount", (n) -> { currentObject.setSignInCount(n.getLongValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getObjectValue(SignInStatus::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the signInCount property value. Count of sign-ins made by the application.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSignInCount() {
        return this._signInCount;
    }
    /**
     * Gets the status property value. Details of the sign-in status.
     * @return a signInStatus
     */
    @javax.annotation.Nullable
    public SignInStatus getStatus() {
        return this._status;
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
        writer.writeOffsetDateTimeValue("aggregatedEventDateTime", this.getAggregatedEventDateTime());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeLongValue("signInCount", this.getSignInCount());
        writer.writeObjectValue("status", this.getStatus());
    }
    /**
     * Sets the aggregatedEventDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the aggregatedEventDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAggregatedEventDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._aggregatedEventDateTime = value;
    }
    /**
     * Sets the appDisplayName property value. Name of the application that the user signed in to.
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this._appDisplayName = value;
    }
    /**
     * Sets the appId property value. ID of the application that the user signed in to.
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the signInCount property value. Count of sign-ins made by the application.
     * @param value Value to set for the signInCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignInCount(@javax.annotation.Nullable final Long value) {
        this._signInCount = value;
    }
    /**
     * Sets the status property value. Details of the sign-in status.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final SignInStatus value) {
        this._status = value;
    }
}
