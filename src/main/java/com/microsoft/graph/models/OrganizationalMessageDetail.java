package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** This will allow the admin to see the specific details of an organizational message that has been created for their tenant */
public class OrganizationalMessageDetail extends Entity implements Parsable {
    /** The content that will be displayed to clients for the message. This includes the text portion of the message and the displayed logo */
    private OrganizationalMessageContent _content;
    /** The date and time of when the message was created */
    private OffsetDateTime _createdDateTime;
    /** The date and time of when the message will stop being displayed to clients */
    private OffsetDateTime _endDateTime;
    /** The frequency at which a client will see the message. Possible values are: weeklyOnce, monthlyOnce, monthlyTwice, unknownFutureValue. */
    private OrganizationalMessageFrequency _frequency;
    /** The date and time of when the message was last modified */
    private OffsetDateTime _lastModifiedDateTime;
    /** Indicates the scenario for the message. Possible values are: onboarding, lifecycle, unknownFutureValue. */
    private OrganizationalMessageScenario _scenario;
    /** The date and time of when the message will start being displayed to clients */
    private OffsetDateTime _startDateTime;
    /** Indicates the deployment status of the message. Possible values are: scheduled, active, completed, cancelled, unknownFutureValue. */
    private OrganizationalMessageStatus _status;
    /** Indicates the area where content will be displayed to customers. Possible values are: actionCenter, getStarted, softLanding, unknownFutureValue. */
    private OrganizationalMessageSurface _surface;
    /** The groups of devices that will receive the message. This also contains a list of excluded groups that will not receive the message regardless of the device being part of an included group */
    private OrganizationalMessageTargeting _targeting;
    /** Indicates the theme for the experience. Possible values are: update, training, welcomeToWindows, explore, unknownFutureValue. */
    private OrganizationalMessageTheme _theme;
    /** The statistics containing how the message was interacted with by clients. This includes the number of impressions, clicks, and dismisses from targeted clients. */
    private OrganizationalMessageInsights _userEngagementStatistics;
    /** Indicates the corresponding variant for the experience */
    private String _variant;
    /**
     * Instantiates a new organizationalMessageDetail and sets the default values.
     * @return a void
     */
    public OrganizationalMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.organizationalMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationalMessageDetail
     */
    @javax.annotation.Nonnull
    public static OrganizationalMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalMessageDetail();
    }
    /**
     * Gets the content property value. The content that will be displayed to clients for the message. This includes the text portion of the message and the displayed logo
     * @return a organizationalMessageContent
     */
    @javax.annotation.Nullable
    public OrganizationalMessageContent getContent() {
        return this._content;
    }
    /**
     * Gets the createdDateTime property value. The date and time of when the message was created
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the endDateTime property value. The date and time of when the message will stop being displayed to clients
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OrganizationalMessageDetail currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("content", (n) -> { currentObject.setContent(n.getObjectValue(OrganizationalMessageContent::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("frequency", (n) -> { currentObject.setFrequency(n.getEnumValue(OrganizationalMessageFrequency.class)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("scenario", (n) -> { currentObject.setScenario(n.getEnumValue(OrganizationalMessageScenario.class)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(OrganizationalMessageStatus.class)); });
            this.put("surface", (n) -> { currentObject.setSurface(n.getEnumValue(OrganizationalMessageSurface.class)); });
            this.put("targeting", (n) -> { currentObject.setTargeting(n.getObjectValue(OrganizationalMessageTargeting::createFromDiscriminatorValue)); });
            this.put("theme", (n) -> { currentObject.setTheme(n.getEnumValue(OrganizationalMessageTheme.class)); });
            this.put("userEngagementStatistics", (n) -> { currentObject.setUserEngagementStatistics(n.getObjectValue(OrganizationalMessageInsights::createFromDiscriminatorValue)); });
            this.put("variant", (n) -> { currentObject.setVariant(n.getStringValue()); });
        }};
    }
    /**
     * Gets the frequency property value. The frequency at which a client will see the message. Possible values are: weeklyOnce, monthlyOnce, monthlyTwice, unknownFutureValue.
     * @return a organizationalMessageFrequency
     */
    @javax.annotation.Nullable
    public OrganizationalMessageFrequency getFrequency() {
        return this._frequency;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time of when the message was last modified
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the scenario property value. Indicates the scenario for the message. Possible values are: onboarding, lifecycle, unknownFutureValue.
     * @return a organizationalMessageScenario
     */
    @javax.annotation.Nullable
    public OrganizationalMessageScenario getScenario() {
        return this._scenario;
    }
    /**
     * Gets the startDateTime property value. The date and time of when the message will start being displayed to clients
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the status property value. Indicates the deployment status of the message. Possible values are: scheduled, active, completed, cancelled, unknownFutureValue.
     * @return a organizationalMessageStatus
     */
    @javax.annotation.Nullable
    public OrganizationalMessageStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the surface property value. Indicates the area where content will be displayed to customers. Possible values are: actionCenter, getStarted, softLanding, unknownFutureValue.
     * @return a organizationalMessageSurface
     */
    @javax.annotation.Nullable
    public OrganizationalMessageSurface getSurface() {
        return this._surface;
    }
    /**
     * Gets the targeting property value. The groups of devices that will receive the message. This also contains a list of excluded groups that will not receive the message regardless of the device being part of an included group
     * @return a organizationalMessageTargeting
     */
    @javax.annotation.Nullable
    public OrganizationalMessageTargeting getTargeting() {
        return this._targeting;
    }
    /**
     * Gets the theme property value. Indicates the theme for the experience. Possible values are: update, training, welcomeToWindows, explore, unknownFutureValue.
     * @return a organizationalMessageTheme
     */
    @javax.annotation.Nullable
    public OrganizationalMessageTheme getTheme() {
        return this._theme;
    }
    /**
     * Gets the userEngagementStatistics property value. The statistics containing how the message was interacted with by clients. This includes the number of impressions, clicks, and dismisses from targeted clients.
     * @return a organizationalMessageInsights
     */
    @javax.annotation.Nullable
    public OrganizationalMessageInsights getUserEngagementStatistics() {
        return this._userEngagementStatistics;
    }
    /**
     * Gets the variant property value. Indicates the corresponding variant for the experience
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVariant() {
        return this._variant;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeEnumValue("frequency", this.getFrequency());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("scenario", this.getScenario());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeEnumValue("surface", this.getSurface());
        writer.writeObjectValue("targeting", this.getTargeting());
        writer.writeEnumValue("theme", this.getTheme());
        writer.writeObjectValue("userEngagementStatistics", this.getUserEngagementStatistics());
        writer.writeStringValue("variant", this.getVariant());
    }
    /**
     * Sets the content property value. The content that will be displayed to clients for the message. This includes the text portion of the message and the displayed logo
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final OrganizationalMessageContent value) {
        this._content = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time of when the message was created
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the endDateTime property value. The date and time of when the message will stop being displayed to clients
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the frequency property value. The frequency at which a client will see the message. Possible values are: weeklyOnce, monthlyOnce, monthlyTwice, unknownFutureValue.
     * @param value Value to set for the frequency property.
     * @return a void
     */
    public void setFrequency(@javax.annotation.Nullable final OrganizationalMessageFrequency value) {
        this._frequency = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time of when the message was last modified
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the scenario property value. Indicates the scenario for the message. Possible values are: onboarding, lifecycle, unknownFutureValue.
     * @param value Value to set for the scenario property.
     * @return a void
     */
    public void setScenario(@javax.annotation.Nullable final OrganizationalMessageScenario value) {
        this._scenario = value;
    }
    /**
     * Sets the startDateTime property value. The date and time of when the message will start being displayed to clients
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the status property value. Indicates the deployment status of the message. Possible values are: scheduled, active, completed, cancelled, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final OrganizationalMessageStatus value) {
        this._status = value;
    }
    /**
     * Sets the surface property value. Indicates the area where content will be displayed to customers. Possible values are: actionCenter, getStarted, softLanding, unknownFutureValue.
     * @param value Value to set for the surface property.
     * @return a void
     */
    public void setSurface(@javax.annotation.Nullable final OrganizationalMessageSurface value) {
        this._surface = value;
    }
    /**
     * Sets the targeting property value. The groups of devices that will receive the message. This also contains a list of excluded groups that will not receive the message regardless of the device being part of an included group
     * @param value Value to set for the targeting property.
     * @return a void
     */
    public void setTargeting(@javax.annotation.Nullable final OrganizationalMessageTargeting value) {
        this._targeting = value;
    }
    /**
     * Sets the theme property value. Indicates the theme for the experience. Possible values are: update, training, welcomeToWindows, explore, unknownFutureValue.
     * @param value Value to set for the theme property.
     * @return a void
     */
    public void setTheme(@javax.annotation.Nullable final OrganizationalMessageTheme value) {
        this._theme = value;
    }
    /**
     * Sets the userEngagementStatistics property value. The statistics containing how the message was interacted with by clients. This includes the number of impressions, clicks, and dismisses from targeted clients.
     * @param value Value to set for the userEngagementStatistics property.
     * @return a void
     */
    public void setUserEngagementStatistics(@javax.annotation.Nullable final OrganizationalMessageInsights value) {
        this._userEngagementStatistics = value;
    }
    /**
     * Sets the variant property value. Indicates the corresponding variant for the experience
     * @param value Value to set for the variant property.
     * @return a void
     */
    public void setVariant(@javax.annotation.Nullable final String value) {
        this._variant = value;
    }
}
