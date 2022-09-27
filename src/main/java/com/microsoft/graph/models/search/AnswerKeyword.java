package com.microsoft.graph.models.search;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AnswerKeyword implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A collection of keywords used to trigger the search answer. */
    private java.util.List<String> _keywords;
    /** If true, indicates that the search term contains similar words to the keywords that should trigger the search answer. */
    private Boolean _matchSimilarKeywords;
    /** The OdataType property */
    private String _odataType;
    /** Unique keywords that will guarantee the search answer is triggered. */
    private java.util.List<String> _reservedKeywords;
    /**
     * Instantiates a new answerKeyword and sets the default values.
     * @return a void
     */
    public AnswerKeyword() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.search.answerKeyword");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a answerKeyword
     */
    @javax.annotation.Nonnull
    public static AnswerKeyword createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnswerKeyword();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AnswerKeyword currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("keywords", (n) -> { currentObject.setKeywords(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("matchSimilarKeywords", (n) -> { currentObject.setMatchSimilarKeywords(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("reservedKeywords", (n) -> { currentObject.setReservedKeywords(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the keywords property value. A collection of keywords used to trigger the search answer.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getKeywords() {
        return this._keywords;
    }
    /**
     * Gets the matchSimilarKeywords property value. If true, indicates that the search term contains similar words to the keywords that should trigger the search answer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMatchSimilarKeywords() {
        return this._matchSimilarKeywords;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the reservedKeywords property value. Unique keywords that will guarantee the search answer is triggered.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getReservedKeywords() {
        return this._reservedKeywords;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("keywords", this.getKeywords());
        writer.writeBooleanValue("matchSimilarKeywords", this.getMatchSimilarKeywords());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("reservedKeywords", this.getReservedKeywords());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the keywords property value. A collection of keywords used to trigger the search answer.
     * @param value Value to set for the keywords property.
     * @return a void
     */
    public void setKeywords(@javax.annotation.Nullable final java.util.List<String> value) {
        this._keywords = value;
    }
    /**
     * Sets the matchSimilarKeywords property value. If true, indicates that the search term contains similar words to the keywords that should trigger the search answer.
     * @param value Value to set for the matchSimilarKeywords property.
     * @return a void
     */
    public void setMatchSimilarKeywords(@javax.annotation.Nullable final Boolean value) {
        this._matchSimilarKeywords = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the reservedKeywords property value. Unique keywords that will guarantee the search answer is triggered.
     * @param value Value to set for the reservedKeywords property.
     * @return a void
     */
    public void setReservedKeywords(@javax.annotation.Nullable final java.util.List<String> value) {
        this._reservedKeywords = value;
    }
}
