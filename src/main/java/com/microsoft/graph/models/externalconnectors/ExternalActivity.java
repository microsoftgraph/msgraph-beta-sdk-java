package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.externalconnectors.ExternalActivityResult;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of externalConnection entities. */
public class ExternalActivity extends Entity implements Parsable {
    /** Represents an identity used to identify who is responsible for the activity. */
    private Identity _performedBy;
    /** When the particular activity occurred. */
    private OffsetDateTime _startDateTime;
    /** The type property */
    private ExternalActivityType _type;
    /**
     * Instantiates a new externalActivity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExternalActivity() {
        super();
        this.setOdataType("#microsoft.graph.externalConnectors.externalActivity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a externalActivity
     */
    @javax.annotation.Nonnull
    public static ExternalActivity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.externalConnectors.externalActivityResult": return new ExternalActivityResult();
            }
        }
        return new ExternalActivity();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExternalActivity currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("performedBy", (n) -> { currentObject.setPerformedBy(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("type", (n) -> { currentObject.setType(n.getEnumValue(ExternalActivityType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the performedBy property value. Represents an identity used to identify who is responsible for the activity.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getPerformedBy() {
        return this._performedBy;
    }
    /**
     * Gets the startDateTime property value. When the particular activity occurred.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the type property value. The type property
     * @return a externalActivityType
     */
    @javax.annotation.Nullable
    public ExternalActivityType getType() {
        return this._type;
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
        writer.writeObjectValue("performedBy", this.getPerformedBy());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the performedBy property value. Represents an identity used to identify who is responsible for the activity.
     * @param value Value to set for the performedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPerformedBy(@javax.annotation.Nullable final Identity value) {
        this._performedBy = value;
    }
    /**
     * Sets the startDateTime property value. When the particular activity occurred.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final ExternalActivityType value) {
        this._type = value;
    }
}
