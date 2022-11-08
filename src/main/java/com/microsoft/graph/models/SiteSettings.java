package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SiteSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The language tag for the language used on this site. */
    private String _languageTag;
    /** The OdataType property */
    private String _odataType;
    /** Indicates the time offset for the time zone of the site from Coordinated Universal Time (UTC). */
    private String _timeZone;
    /**
     * Instantiates a new siteSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SiteSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.siteSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a siteSettings
     */
    @javax.annotation.Nonnull
    public static SiteSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SiteSettings();
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
        final SiteSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("languageTag", (n) -> { currentObject.setLanguageTag(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("timeZone", (n) -> { currentObject.setTimeZone(n.getStringValue()); });
        }};
    }
    /**
     * Gets the languageTag property value. The language tag for the language used on this site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguageTag() {
        return this._languageTag;
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
     * Gets the timeZone property value. Indicates the time offset for the time zone of the site from Coordinated Universal Time (UTC).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimeZone() {
        return this._timeZone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("languageTag", this.getLanguageTag());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("timeZone", this.getTimeZone());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the languageTag property value. The language tag for the language used on this site.
     * @param value Value to set for the languageTag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanguageTag(@javax.annotation.Nullable final String value) {
        this._languageTag = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the timeZone property value. Indicates the time offset for the time zone of the site from Coordinated Universal Time (UTC).
     * @param value Value to set for the timeZone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeZone(@javax.annotation.Nullable final String value) {
        this._timeZone = value;
    }
}
