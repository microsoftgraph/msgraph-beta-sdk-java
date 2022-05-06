package microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
import microsoft.graph.models.IdentitySet;
public class ReviewSet extends Entity implements Parsable {
    /** The user who created the review set. Read-only.  */
    private IdentitySet _createdBy;
    /** The datetime when the review set was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.  */
    private OffsetDateTime _createdDateTime;
    /** The review set name. The name is unique with a maximum limit of 64 characters.  */
    private String _displayName;
    /** Read-only. Nullable.  */
    private java.util.List<ReviewSetQuery> _queries;
    /**
     * Instantiates a new reviewSet and sets the default values.
     * @return a void
     */
    public ReviewSet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a reviewSet
     */
    @javax.annotation.Nonnull
    public static ReviewSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReviewSet();
    }
    /**
     * Gets the createdBy property value. The user who created the review set. Read-only.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The datetime when the review set was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the displayName property value. The review set name. The name is unique with a maximum limit of 64 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ReviewSet currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("queries", (n) -> { currentObject.setQueries(n.getCollectionOfObjectValues(ReviewSetQuery::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the queries property value. Read-only. Nullable.
     * @return a reviewSetQuery
     */
    @javax.annotation.Nullable
    public java.util.List<ReviewSetQuery> getQueries() {
        return this._queries;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("queries", this.getQueries());
    }
    /**
     * Sets the createdBy property value. The user who created the review set. Read-only.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The datetime when the review set was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The review set name. The name is unique with a maximum limit of 64 characters.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the queries property value. Read-only. Nullable.
     * @param value Value to set for the queries property.
     * @return a void
     */
    public void setQueries(@javax.annotation.Nullable final java.util.List<ReviewSetQuery> value) {
        this._queries = value;
    }
}
