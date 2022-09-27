package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A complex type to store the windows update rollout settings including offer start date time, offer end date time, and days between each set of offers. */
public class WindowsUpdateRolloutSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** The feature update's ending  of release date and time to be set, update, and displayed for a feature Update profile for example: 2020-06-09T10:00:00Z. */
    private OffsetDateTime _offerEndDateTimeInUTC;
    /** The number of day(s) between each set of offers to be set, updated, and displayed for a feature update profile, for example: if OfferStartDateTimeInUTC is 2020-06-09T10:00:00Z, and OfferIntervalInDays is 1, then the next two sets of offers will be made consecutively on 2020-06-10T10:00:00Z (next day at the same specified time) and 2020-06-11T10:00:00Z (next next day at the same specified time) with 1 day in between each set of offers. */
    private Integer _offerIntervalInDays;
    /** The feature update's starting date and time to be set, update, and displayed for a feature Update profile for example: 2020-06-09T10:00:00Z. */
    private OffsetDateTime _offerStartDateTimeInUTC;
    /**
     * Instantiates a new windowsUpdateRolloutSettings and sets the default values.
     * @return a void
     */
    public WindowsUpdateRolloutSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.windowsUpdateRolloutSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsUpdateRolloutSettings
     */
    @javax.annotation.Nonnull
    public static WindowsUpdateRolloutSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUpdateRolloutSettings();
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
        final WindowsUpdateRolloutSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("offerEndDateTimeInUTC", (n) -> { currentObject.setOfferEndDateTimeInUTC(n.getOffsetDateTimeValue()); });
            this.put("offerIntervalInDays", (n) -> { currentObject.setOfferIntervalInDays(n.getIntegerValue()); });
            this.put("offerStartDateTimeInUTC", (n) -> { currentObject.setOfferStartDateTimeInUTC(n.getOffsetDateTimeValue()); });
        }};
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
     * Gets the offerEndDateTimeInUTC property value. The feature update's ending  of release date and time to be set, update, and displayed for a feature Update profile for example: 2020-06-09T10:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOfferEndDateTimeInUTC() {
        return this._offerEndDateTimeInUTC;
    }
    /**
     * Gets the offerIntervalInDays property value. The number of day(s) between each set of offers to be set, updated, and displayed for a feature update profile, for example: if OfferStartDateTimeInUTC is 2020-06-09T10:00:00Z, and OfferIntervalInDays is 1, then the next two sets of offers will be made consecutively on 2020-06-10T10:00:00Z (next day at the same specified time) and 2020-06-11T10:00:00Z (next next day at the same specified time) with 1 day in between each set of offers.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOfferIntervalInDays() {
        return this._offerIntervalInDays;
    }
    /**
     * Gets the offerStartDateTimeInUTC property value. The feature update's starting date and time to be set, update, and displayed for a feature Update profile for example: 2020-06-09T10:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOfferStartDateTimeInUTC() {
        return this._offerStartDateTimeInUTC;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("offerEndDateTimeInUTC", this.getOfferEndDateTimeInUTC());
        writer.writeIntegerValue("offerIntervalInDays", this.getOfferIntervalInDays());
        writer.writeOffsetDateTimeValue("offerStartDateTimeInUTC", this.getOfferStartDateTimeInUTC());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the offerEndDateTimeInUTC property value. The feature update's ending  of release date and time to be set, update, and displayed for a feature Update profile for example: 2020-06-09T10:00:00Z.
     * @param value Value to set for the offerEndDateTimeInUTC property.
     * @return a void
     */
    public void setOfferEndDateTimeInUTC(@javax.annotation.Nullable final OffsetDateTime value) {
        this._offerEndDateTimeInUTC = value;
    }
    /**
     * Sets the offerIntervalInDays property value. The number of day(s) between each set of offers to be set, updated, and displayed for a feature update profile, for example: if OfferStartDateTimeInUTC is 2020-06-09T10:00:00Z, and OfferIntervalInDays is 1, then the next two sets of offers will be made consecutively on 2020-06-10T10:00:00Z (next day at the same specified time) and 2020-06-11T10:00:00Z (next next day at the same specified time) with 1 day in between each set of offers.
     * @param value Value to set for the offerIntervalInDays property.
     * @return a void
     */
    public void setOfferIntervalInDays(@javax.annotation.Nullable final Integer value) {
        this._offerIntervalInDays = value;
    }
    /**
     * Sets the offerStartDateTimeInUTC property value. The feature update's starting date and time to be set, update, and displayed for a feature Update profile for example: 2020-06-09T10:00:00Z.
     * @param value Value to set for the offerStartDateTimeInUTC property.
     * @return a void
     */
    public void setOfferStartDateTimeInUTC(@javax.annotation.Nullable final OffsetDateTime value) {
        this._offerStartDateTimeInUTC = value;
    }
}
