package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExactMatchLookupJob extends ExactMatchJobBase implements Parsable {
    /**
     * Instantiates a new ExactMatchLookupJob and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static ExactMatchLookupJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExactMatchLookupJob();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("matchingRows", (n) -> { this.setMatchingRows(n.getCollectionOfObjectValues(LookupResultRow::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the matchingRows property value. The matchingRows property
     * @return a java.util.List<LookupResultRow>
     */
    @jakarta.annotation.Nullable
    public java.util.List<LookupResultRow> getMatchingRows() {
        return this.backingStore.get("matchingRows");
    }
    /**
     * Gets the state property value. The state property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("matchingRows", this.getMatchingRows());
        writer.writeStringValue("state", this.getState());
    }
    /**
     * Sets the matchingRows property value. The matchingRows property
     * @param value Value to set for the matchingRows property.
     */
    public void setMatchingRows(@jakarta.annotation.Nullable final java.util.List<LookupResultRow> value) {
        this.backingStore.set("matchingRows", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("state", value);
    }
}
