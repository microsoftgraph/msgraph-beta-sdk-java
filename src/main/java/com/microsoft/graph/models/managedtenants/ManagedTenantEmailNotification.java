package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class ManagedTenantEmailNotification extends Entity implements Parsable {
    /** The alert property */
    private ManagedTenantAlert _alert;
    /** The createdByUserId property */
    private String _createdByUserId;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The emailAddresses property */
    private java.util.List<Email> _emailAddresses;
    /** The emailBody property */
    private String _emailBody;
    /** The lastActionByUserId property */
    private String _lastActionByUserId;
    /** The lastActionDateTime property */
    private OffsetDateTime _lastActionDateTime;
    /** The subject property */
    private String _subject;
    /**
     * Instantiates a new managedTenantEmailNotification and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedTenantEmailNotification() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.managedTenantEmailNotification");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedTenantEmailNotification
     */
    @javax.annotation.Nonnull
    public static ManagedTenantEmailNotification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedTenantEmailNotification();
    }
    /**
     * Gets the alert property value. The alert property
     * @return a managedTenantAlert
     */
    @javax.annotation.Nullable
    public ManagedTenantAlert getAlert() {
        return this._alert;
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedByUserId() {
        return this._createdByUserId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the emailAddresses property value. The emailAddresses property
     * @return a email
     */
    @javax.annotation.Nullable
    public java.util.List<Email> getEmailAddresses() {
        return this._emailAddresses;
    }
    /**
     * Gets the emailBody property value. The emailBody property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailBody() {
        return this._emailBody;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedTenantEmailNotification currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("alert", (n) -> { currentObject.setAlert(n.getObjectValue(ManagedTenantAlert::createFromDiscriminatorValue)); });
            this.put("createdByUserId", (n) -> { currentObject.setCreatedByUserId(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("emailAddresses", (n) -> { currentObject.setEmailAddresses(n.getCollectionOfObjectValues(Email::createFromDiscriminatorValue)); });
            this.put("emailBody", (n) -> { currentObject.setEmailBody(n.getStringValue()); });
            this.put("lastActionByUserId", (n) -> { currentObject.setLastActionByUserId(n.getStringValue()); });
            this.put("lastActionDateTime", (n) -> { currentObject.setLastActionDateTime(n.getOffsetDateTimeValue()); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastActionByUserId property value. The lastActionByUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastActionByUserId() {
        return this._lastActionByUserId;
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this._lastActionDateTime;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this._subject;
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
        writer.writeObjectValue("alert", this.getAlert());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("emailAddresses", this.getEmailAddresses());
        writer.writeStringValue("emailBody", this.getEmailBody());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeStringValue("subject", this.getSubject());
    }
    /**
     * Sets the alert property value. The alert property
     * @param value Value to set for the alert property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlert(@javax.annotation.Nullable final ManagedTenantAlert value) {
        this._alert = value;
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedByUserId(@javax.annotation.Nullable final String value) {
        this._createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the emailAddresses property value. The emailAddresses property
     * @param value Value to set for the emailAddresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailAddresses(@javax.annotation.Nullable final java.util.List<Email> value) {
        this._emailAddresses = value;
    }
    /**
     * Sets the emailBody property value. The emailBody property
     * @param value Value to set for the emailBody property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailBody(@javax.annotation.Nullable final String value) {
        this._emailBody = value;
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionByUserId(@javax.annotation.Nullable final String value) {
        this._lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActionDateTime = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this._subject = value;
    }
}
