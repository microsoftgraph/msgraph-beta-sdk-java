package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExactMatchLookupJob extends ExactMatchJobBase implements Parsable {
    /** The matchingRows property */
    private java.util.List<LookupResultRow> _matchingRows;
    /** The state property */
    private String _state;
    /**
     * Instantiates a new ExactMatchLookupJob and sets the default values.
     * @return a void
     */
    public ExactMatchLookupJob() {
        super();
        this.setOdataType("#microsoft.graph.exactMatchLookupJob");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExactMatchLookupJob
     */
    @javax.annotation.Nonnull
    public static ExactMatchLookupJob createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExactMatchLookupJob();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExactMatchLookupJob currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("matchingRows", (n) -> { currentObject.setMatchingRows(n.getCollectionOfObjectValues(LookupResultRow::createFromDiscriminatorValue)); });
            this.put("state", (n) -> { currentObject.setState(n.getStringValue()); });
        }};
    }
    /**
     * Gets the matchingRows property value. The matchingRows property
     * @return a lookupResultRow
     */
    @javax.annotation.Nullable
    public java.util.List<LookupResultRow> getMatchingRows() {
        return this._matchingRows;
    }
    /**
     * Gets the state property value. The state property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("matchingRows", this.getMatchingRows());
        writer.writeStringValue("state", this.getState());
    }
    /**
     * Sets the matchingRows property value. The matchingRows property
     * @param value Value to set for the matchingRows property.
     * @return a void
     */
    public void setMatchingRows(@javax.annotation.Nullable final java.util.List<LookupResultRow> value) {
        this._matchingRows = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final String value) {
        this._state = value;
    }
}
