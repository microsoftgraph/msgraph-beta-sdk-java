package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PositionDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Detail about the company or employer.
     */
    private CompanyDetail company;
    /**
     * Description of the position in question.
     */
    private String description;
    /**
     * When the position ended.
     */
    private LocalDate endMonthYear;
    /**
     * The title held when in that position.
     */
    private String jobTitle;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The role the position entailed.
     */
    private String role;
    /**
     * The start month and year of the position.
     */
    private LocalDate startMonthYear;
    /**
     * Short summary of the position.
     */
    private String summary;
    /**
     * Instantiates a new PositionDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PositionDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PositionDetail
     */
    @javax.annotation.Nonnull
    public static PositionDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PositionDetail();
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
     * Gets the company property value. Detail about the company or employer.
     * @return a companyDetail
     */
    @javax.annotation.Nullable
    public CompanyDetail getCompany() {
        return this.company;
    }
    /**
     * Gets the description property value. Description of the position in question.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the endMonthYear property value. When the position ended.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getEndMonthYear() {
        return this.endMonthYear;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("company", (n) -> { this.setCompany(n.getObjectValue(CompanyDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("endMonthYear", (n) -> { this.setEndMonthYear(n.getLocalDateValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("startMonthYear", (n) -> { this.setStartMonthYear(n.getLocalDateValue()); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the jobTitle property value. The title held when in that position.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobTitle() {
        return this.jobTitle;
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
     * Gets the role property value. The role the position entailed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRole() {
        return this.role;
    }
    /**
     * Gets the startMonthYear property value. The start month and year of the position.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getStartMonthYear() {
        return this.startMonthYear;
    }
    /**
     * Gets the summary property value. Short summary of the position.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSummary() {
        return this.summary;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("company", this.getCompany());
        writer.writeStringValue("description", this.getDescription());
        writer.writeLocalDateValue("endMonthYear", this.getEndMonthYear());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("role", this.getRole());
        writer.writeLocalDateValue("startMonthYear", this.getStartMonthYear());
        writer.writeStringValue("summary", this.getSummary());
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
     * Sets the company property value. Detail about the company or employer.
     * @param value Value to set for the company property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompany(@javax.annotation.Nullable final CompanyDetail value) {
        this.company = value;
    }
    /**
     * Sets the description property value. Description of the position in question.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the endMonthYear property value. When the position ended.
     * @param value Value to set for the endMonthYear property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndMonthYear(@javax.annotation.Nullable final LocalDate value) {
        this.endMonthYear = value;
    }
    /**
     * Sets the jobTitle property value. The title held when in that position.
     * @param value Value to set for the jobTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobTitle(@javax.annotation.Nullable final String value) {
        this.jobTitle = value;
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
    /**
     * Sets the role property value. The role the position entailed.
     * @param value Value to set for the role property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRole(@javax.annotation.Nullable final String value) {
        this.role = value;
    }
    /**
     * Sets the startMonthYear property value. The start month and year of the position.
     * @param value Value to set for the startMonthYear property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMonthYear(@javax.annotation.Nullable final LocalDate value) {
        this.startMonthYear = value;
    }
    /**
     * Sets the summary property value. Short summary of the position.
     * @param value Value to set for the summary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSummary(@javax.annotation.Nullable final String value) {
        this.summary = value;
    }
}
