package com.microsoft.graph.models.search;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Acronym extends SearchAnswer implements Parsable {
    /**
     * What the acronym stands for.
     */
    private String standsFor;
    /**
     * The state property
     */
    private AnswerState state;
    /**
     * Instantiates a new acronym and sets the default values.
     */
    public Acronym() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a acronym
     */
    @jakarta.annotation.Nonnull
    public static Acronym createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Acronym();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("standsFor", (n) -> { this.setStandsFor(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AnswerState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the standsFor property value. What the acronym stands for.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getStandsFor() {
        return this.standsFor;
    }
    /**
     * Gets the state property value. The state property
     * @return a answerState
     */
    @jakarta.annotation.Nullable
    public AnswerState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("standsFor", this.getStandsFor());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the standsFor property value. What the acronym stands for.
     * @param value Value to set for the standsFor property.
     */
    public void setStandsFor(@jakarta.annotation.Nullable final String value) {
        this.standsFor = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final AnswerState value) {
        this.state = value;
    }
}
