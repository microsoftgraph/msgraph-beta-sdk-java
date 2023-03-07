package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PersonNamePronounciation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The displayName property */
    private String displayName;
    /** The first property */
    private String first;
    /** The last property */
    private String last;
    /** The maiden property */
    private String maiden;
    /** The middle property */
    private String middle;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new personNamePronounciation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PersonNamePronounciation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a personNamePronounciation
     */
    @javax.annotation.Nonnull
    public static PersonNamePronounciation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonNamePronounciation();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("first", (n) -> { this.setFirst(n.getStringValue()); });
        deserializerMap.put("last", (n) -> { this.setLast(n.getStringValue()); });
        deserializerMap.put("maiden", (n) -> { this.setMaiden(n.getStringValue()); });
        deserializerMap.put("middle", (n) -> { this.setMiddle(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the first property value. The first property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFirst() {
        return this.first;
    }
    /**
     * Gets the last property value. The last property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLast() {
        return this.last;
    }
    /**
     * Gets the maiden property value. The maiden property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaiden() {
        return this.maiden;
    }
    /**
     * Gets the middle property value. The middle property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMiddle() {
        return this.middle;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("first", this.getFirst());
        writer.writeStringValue("last", this.getLast());
        writer.writeStringValue("maiden", this.getMaiden());
        writer.writeStringValue("middle", this.getMiddle());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the first property value. The first property
     * @param value Value to set for the first property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirst(@javax.annotation.Nullable final String value) {
        this.first = value;
    }
    /**
     * Sets the last property value. The last property
     * @param value Value to set for the last property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLast(@javax.annotation.Nullable final String value) {
        this.last = value;
    }
    /**
     * Sets the maiden property value. The maiden property
     * @param value Value to set for the maiden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaiden(@javax.annotation.Nullable final String value) {
        this.maiden = value;
    }
    /**
     * Sets the middle property value. The middle property
     * @param value Value to set for the middle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMiddle(@javax.annotation.Nullable final String value) {
        this.middle = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
