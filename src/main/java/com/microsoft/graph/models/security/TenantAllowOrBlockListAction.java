package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantAllowOrBlockListAction implements AdditionalDataHolder, Parsable {
    /**
     * Specifies whether the tenant allow block list is an allow or block. The possible values are: allow, block, and unkownFutureValue.
     */
    private TenantAllowBlockListAction action;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies when the tenant allow-block-list expires in date time.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * Specifies the note added to the tenant allow block list entry in the format of string.
     */
    private String note;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Contains the result of the submission that lead to the tenant allow-block-list entry creation.
     */
    private java.util.List<TenantAllowBlockListEntryResult> results;
    /**
     * Instantiates a new tenantAllowOrBlockListAction and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TenantAllowOrBlockListAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantAllowOrBlockListAction
     */
    @javax.annotation.Nonnull
    public static TenantAllowOrBlockListAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantAllowOrBlockListAction();
    }
    /**
     * Gets the action property value. Specifies whether the tenant allow block list is an allow or block. The possible values are: allow, block, and unkownFutureValue.
     * @return a tenantAllowBlockListAction
     */
    @javax.annotation.Nullable
    public TenantAllowBlockListAction getAction() {
        return this.action;
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
     * Gets the expirationDateTime property value. Specifies when the tenant allow-block-list expires in date time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(TenantAllowBlockListAction.class)); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("note", (n) -> { this.setNote(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("results", (n) -> { this.setResults(n.getCollectionOfObjectValues(TenantAllowBlockListEntryResult::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the note property value. Specifies the note added to the tenant allow block list entry in the format of string.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNote() {
        return this.note;
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
     * Gets the results property value. Contains the result of the submission that lead to the tenant allow-block-list entry creation.
     * @return a tenantAllowBlockListEntryResult
     */
    @javax.annotation.Nullable
    public java.util.List<TenantAllowBlockListEntryResult> getResults() {
        return this.results;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("note", this.getNote());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("results", this.getResults());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. Specifies whether the tenant allow block list is an allow or block. The possible values are: allow, block, and unkownFutureValue.
     * @param value Value to set for the action property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAction(@javax.annotation.Nullable final TenantAllowBlockListAction value) {
        this.action = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the expirationDateTime property value. Specifies when the tenant allow-block-list expires in date time.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the note property value. Specifies the note added to the tenant allow block list entry in the format of string.
     * @param value Value to set for the note property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNote(@javax.annotation.Nullable final String value) {
        this.note = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the results property value. Contains the result of the submission that lead to the tenant allow-block-list entry creation.
     * @param value Value to set for the results property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResults(@javax.annotation.Nullable final java.util.List<TenantAllowBlockListEntryResult> value) {
        this.results = value;
    }
}
