package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains statistics into how the organizational message was interacted with by clients */
public class OrganizationalMessageInsights implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The number of times this message was clicked on */
    private Integer _clicks;
    /** The number of times this message was dismissed by a user. This may not be collected for some surfaces and will be null */
    private Integer _dismisses;
    /** The number of times this message was shown to all clients */
    private Integer _impressions;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new organizationalMessageInsights and sets the default values.
     * @return a void
     */
    public OrganizationalMessageInsights() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.organizationalMessageInsights");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationalMessageInsights
     */
    @javax.annotation.Nonnull
    public static OrganizationalMessageInsights createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalMessageInsights();
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
     * Gets the clicks property value. The number of times this message was clicked on
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getClicks() {
        return this._clicks;
    }
    /**
     * Gets the dismisses property value. The number of times this message was dismissed by a user. This may not be collected for some surfaces and will be null
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDismisses() {
        return this._dismisses;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OrganizationalMessageInsights currentObject = this;
        return new HashMap<>(4) {{
            this.put("clicks", (n) -> { currentObject.setClicks(n.getIntegerValue()); });
            this.put("dismisses", (n) -> { currentObject.setDismisses(n.getIntegerValue()); });
            this.put("impressions", (n) -> { currentObject.setImpressions(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the impressions property value. The number of times this message was shown to all clients
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getImpressions() {
        return this._impressions;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("clicks", this.getClicks());
        writer.writeIntegerValue("dismisses", this.getDismisses());
        writer.writeIntegerValue("impressions", this.getImpressions());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the clicks property value. The number of times this message was clicked on
     * @param value Value to set for the clicks property.
     * @return a void
     */
    public void setClicks(@javax.annotation.Nullable final Integer value) {
        this._clicks = value;
    }
    /**
     * Sets the dismisses property value. The number of times this message was dismissed by a user. This may not be collected for some surfaces and will be null
     * @param value Value to set for the dismisses property.
     * @return a void
     */
    public void setDismisses(@javax.annotation.Nullable final Integer value) {
        this._dismisses = value;
    }
    /**
     * Sets the impressions property value. The number of times this message was shown to all clients
     * @param value Value to set for the impressions property.
     * @return a void
     */
    public void setImpressions(@javax.annotation.Nullable final Integer value) {
        this._impressions = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
