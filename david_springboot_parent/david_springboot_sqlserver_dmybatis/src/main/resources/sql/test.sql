/*
Navicat SQL Server Data Transfer

Source Server         : 192.168.1.204,1433
Source Server Version : 120000
Source Host           : 192.168.1.204,1433:1433
Source Database       : test
Source Schema         : test

Target Server Type    : SQL Server
Target Server Version : 120000
File Encoding         : 65001

Date: 2018-12-05 11:42:29
*/


-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE [test].[city]
GO
CREATE TABLE [test].[city] (
[id] bigint NOT NULL ,
[name] nvarchar(255) NULL ,
[state] nvarchar(255) NULL 
)


GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'test', 
'TABLE', N'city', 
NULL, NULL)) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'市级信息'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'city'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'市级信息'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'city'
GO

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO [test].[city] ([id], [name], [state]) VALUES (N'1', N'石家庄', N'河北')
GO
GO
INSERT INTO [test].[city] ([id], [name], [state]) VALUES (N'2', N'邯郸', N'河北')
GO
GO

-- ----------------------------
-- Table structure for country
-- ----------------------------
DROP TABLE [test].[country]
GO
CREATE TABLE [test].[country] (
[Id] int NOT NULL ,
[countryname] nvarchar(255) NULL ,
[countrycode] nvarchar(255) NULL 
)


GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'test', 
'TABLE', N'country', 
NULL, NULL)) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'国家信息'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'country'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'国家信息'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'country'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'test', 
'TABLE', N'country', 
'COLUMN', N'Id')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'主键'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'country'
, @level2type = 'COLUMN', @level2name = N'Id'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'主键'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'country'
, @level2type = 'COLUMN', @level2name = N'Id'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'test', 
'TABLE', N'country', 
'COLUMN', N'countryname')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'名称'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'country'
, @level2type = 'COLUMN', @level2name = N'countryname'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'名称'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'country'
, @level2type = 'COLUMN', @level2name = N'countryname'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'test', 
'TABLE', N'country', 
'COLUMN', N'countrycode')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'代码'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'country'
, @level2type = 'COLUMN', @level2name = N'countrycode'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'代码'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'country'
, @level2type = 'COLUMN', @level2name = N'countrycode'
GO

-- ----------------------------
-- Records of country
-- ----------------------------
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'1', N'Angola', N'AO')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'2', N'Afghanistan', N'AF')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'3', N'Albania', N'AL')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'4', N'Algeria', N'DZ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'5', N'Andorra', N'AD')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'6', N'Anguilla', N'AI')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'7', N'Antigua and Barbuda', N'AG')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'8', N'Argentina', N'AR')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'9', N'Armenia', N'AM')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'10', N'Australia', N'AU')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'11', N'Austria', N'AT')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'12', N'Azerbaijan', N'AZ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'13', N'Bahamas', N'BS')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'14', N'Bahrain', N'BH')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'15', N'Bangladesh', N'BD')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'16', N'Barbados', N'BB')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'17', N'Belarus', N'BY')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'18', N'Belgium', N'BE')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'19', N'Belize', N'BZ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'20', N'Benin', N'BJ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'21', N'Bermuda Is.', N'BM')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'22', N'Bolivia', N'BO')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'23', N'Botswana', N'BW')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'24', N'Brazil', N'BR')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'25', N'Brunei', N'BN')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'26', N'Bulgaria', N'BG')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'27', N'Burkina-faso', N'BF')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'28', N'Burma', N'MM')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'29', N'Burundi', N'BI')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'30', N'Cameroon', N'CM')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'31', N'Canada', N'CA')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'32', N'Central African Republic', N'CF')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'33', N'Chad', N'TD')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'34', N'Chile', N'CL')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'35', N'China', N'CN')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'36', N'Colombia', N'CO')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'37', N'Congo', N'CG')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'38', N'Cook Is.', N'CK')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'39', N'Costa Rica', N'CR')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'40', N'Cuba', N'CU')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'41', N'Cyprus', N'CY')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'42', N'Czech Republic', N'CZ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'43', N'Denmark', N'DK')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'44', N'Djibouti', N'DJ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'45', N'Dominica Rep.', N'DO')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'46', N'Ecuador', N'EC')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'47', N'Egypt', N'EG')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'48', N'EI Salvador', N'SV')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'49', N'Estonia', N'EE')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'50', N'Ethiopia', N'ET')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'51', N'Fiji', N'FJ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'52', N'Finland', N'FI')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'53', N'France', N'FR')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'54', N'French Guiana', N'GF')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'55', N'Gabon', N'GA')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'56', N'Gambia', N'GM')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'57', N'Georgia', N'GE')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'58', N'Germany', N'DE')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'59', N'Ghana', N'GH')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'60', N'Gibraltar', N'GI')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'61', N'Greece', N'GR')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'62', N'Grenada', N'GD')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'63', N'Guam', N'GU')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'64', N'Guatemala', N'GT')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'65', N'Guinea', N'GN')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'66', N'Guyana', N'GY')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'67', N'Haiti', N'HT')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'68', N'Honduras', N'HN')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'69', N'Hongkong', N'HK')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'70', N'Hungary', N'HU')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'71', N'Iceland', N'IS')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'72', N'India', N'IN')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'73', N'Indonesia', N'ID')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'74', N'Iran', N'IR')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'75', N'Iraq', N'IQ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'76', N'Ireland', N'IE')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'77', N'Israel', N'IL')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'78', N'Italy', N'IT')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'79', N'Jamaica', N'JM')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'80', N'Japan', N'JP')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'81', N'Jordan', N'JO')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'82', N'Kampuchea (Cambodia )', N'KH')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'83', N'Kazakstan', N'KZ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'84', N'Kenya', N'KE')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'85', N'Korea', N'KR')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'86', N'Kuwait', N'KW')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'87', N'Kyrgyzstan', N'KG')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'88', N'Laos', N'LA')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'89', N'Latvia', N'LV')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'90', N'Lebanon', N'LB')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'91', N'Lesotho', N'LS')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'92', N'Liberia', N'LR')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'93', N'Libya', N'LY')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'94', N'Liechtenstein', N'LI')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'95', N'Lithuania', N'LT')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'96', N'Luxembourg', N'LU')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'97', N'Macao', N'MO')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'98', N'Madagascar', N'MG')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'99', N'Malawi', N'MW')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'100', N'Malaysia', N'MY')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'101', N'Maldives', N'MV')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'102', N'Mali', N'ML')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'103', N'Malta', N'MT')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'104', N'Mauritius', N'MU')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'105', N'Mexico', N'MX')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'106', N'Moldova, Republic of', N'MD')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'107', N'Monaco', N'MC')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'108', N'Mongolia', N'MN')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'109', N'Montserrat Is', N'MS')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'110', N'Morocco', N'MA')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'111', N'Mozambique', N'MZ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'112', N'Namibia', N'NA')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'113', N'Nauru', N'NR')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'114', N'Nepal', N'NP')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'115', N'Netherlands', N'NL')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'116', N'New Zealand', N'NZ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'117', N'Nicaragua', N'NI')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'118', N'Niger', N'NE')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'119', N'Nigeria', N'NG')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'120', N'North Korea', N'KP')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'121', N'Norway', N'NO')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'122', N'Oman', N'OM')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'123', N'Pakistan', N'PK')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'124', N'Panama', N'PA')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'125', N'Papua New Cuinea', N'PG')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'126', N'Paraguay', N'PY')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'127', N'Peru', N'PE')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'128', N'Philippines', N'PH')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'129', N'Poland', N'PL')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'130', N'French Polynesia', N'PF')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'131', N'Portugal', N'PT')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'132', N'Puerto Rico', N'PR')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'133', N'Qatar', N'QA')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'134', N'Romania', N'RO')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'135', N'Russia', N'RU')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'136', N'Saint Lueia', N'LC')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'137', N'Saint Vincent', N'VC')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'138', N'San Marino', N'SM')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'139', N'Sao Tome and Principe', N'ST')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'140', N'Saudi Arabia', N'SA')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'141', N'Senegal', N'SN')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'142', N'Seychelles', N'SC')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'143', N'Sierra Leone', N'SL')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'144', N'Singapore', N'SG')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'145', N'Slovakia', N'SK')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'146', N'Slovenia', N'SI')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'147', N'Solomon Is', N'SB')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'148', N'Somali', N'SO')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'149', N'South Africa', N'ZA')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'150', N'Spain', N'ES')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'151', N'Sri Lanka', N'LK')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'152', N'St.Lucia', N'LC')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'153', N'St.Vincent', N'VC')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'154', N'Sudan', N'SD')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'155', N'Suriname', N'SR')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'156', N'Swaziland', N'SZ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'157', N'Sweden', N'SE')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'158', N'Switzerland', N'CH')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'159', N'Syria', N'SY')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'160', N'Taiwan', N'TW')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'161', N'Tajikstan', N'TJ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'162', N'Tanzania', N'TZ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'163', N'Thailand', N'TH')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'164', N'Togo', N'TG')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'165', N'Tonga', N'TO')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'166', N'Trinidad and Tobago', N'TT')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'167', N'Tunisia', N'TN')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'168', N'Turkey', N'TR')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'169', N'Turkmenistan', N'TM')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'170', N'Uganda', N'UG')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'171', N'Ukraine', N'UA')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'172', N'United Arab Emirates', N'AE')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'173', N'United Kiongdom', N'GB')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'174', N'United States of America', N'US')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'175', N'Uruguay', N'UY')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'176', N'Uzbekistan', N'UZ')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'177', N'Venezuela', N'VE')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'178', N'Vietnam', N'VN')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'179', N'Yemen', N'YE')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'180', N'Yugoslavia', N'YU')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'181', N'Zimbabwe', N'ZW')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'182', N'Zaire', N'ZR')
GO
GO
INSERT INTO [test].[country] ([Id], [countryname], [countrycode]) VALUES (N'183', N'Zambia', N'ZM')
GO
GO

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE [test].[user_info]
GO
CREATE TABLE [test].[user_info] (
[Id] int NOT NULL ,
[username] nvarchar(32) NOT NULL ,
[password] nvarchar(32) NULL ,
[usertype] nvarchar(2) NULL ,
[enabled] int NULL ,
[realname] nvarchar(32) NULL ,
[qq] nvarchar(14) NULL ,
[email] nvarchar(100) NULL ,
[tel] nvarchar(255) NULL 
)


GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'test', 
'TABLE', N'user_info', 
NULL, NULL)) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'用户信息表'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'用户信息表'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'test', 
'TABLE', N'user_info', 
'COLUMN', N'username')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'用户名'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
, @level2type = 'COLUMN', @level2name = N'username'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'用户名'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
, @level2type = 'COLUMN', @level2name = N'username'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'test', 
'TABLE', N'user_info', 
'COLUMN', N'password')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'密码'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
, @level2type = 'COLUMN', @level2name = N'password'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'密码'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
, @level2type = 'COLUMN', @level2name = N'password'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'test', 
'TABLE', N'user_info', 
'COLUMN', N'usertype')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'用户类型'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
, @level2type = 'COLUMN', @level2name = N'usertype'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'用户类型'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
, @level2type = 'COLUMN', @level2name = N'usertype'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'test', 
'TABLE', N'user_info', 
'COLUMN', N'enabled')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'是否可用'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
, @level2type = 'COLUMN', @level2name = N'enabled'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'是否可用'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
, @level2type = 'COLUMN', @level2name = N'enabled'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'test', 
'TABLE', N'user_info', 
'COLUMN', N'realname')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'真实姓名'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
, @level2type = 'COLUMN', @level2name = N'realname'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'真实姓名'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
, @level2type = 'COLUMN', @level2name = N'realname'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'test', 
'TABLE', N'user_info', 
'COLUMN', N'qq')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'QQ'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
, @level2type = 'COLUMN', @level2name = N'qq'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'QQ'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
, @level2type = 'COLUMN', @level2name = N'qq'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'test', 
'TABLE', N'user_info', 
'COLUMN', N'tel')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'联系电话'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
, @level2type = 'COLUMN', @level2name = N'tel'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'联系电话'
, @level0type = 'SCHEMA', @level0name = N'test'
, @level1type = 'TABLE', @level1name = N'user_info'
, @level2type = 'COLUMN', @level2name = N'tel'
GO

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO [test].[user_info] ([Id], [username], [password], [usertype], [enabled], [realname], [qq], [email], [tel]) VALUES (N'1', N'test1', N'12345678', N'1', null, null, null, null, null)
GO
GO
INSERT INTO [test].[user_info] ([Id], [username], [password], [usertype], [enabled], [realname], [qq], [email], [tel]) VALUES (N'2', N'test2', N'aaaa', N'2', null, null, null, null, null)
GO
GO
INSERT INTO [test].[user_info] ([Id], [username], [password], [usertype], [enabled], [realname], [qq], [email], [tel]) VALUES (N'3', N'test3', N'bbbb', N'1', null, null, null, null, null)
GO
GO
INSERT INTO [test].[user_info] ([Id], [username], [password], [usertype], [enabled], [realname], [qq], [email], [tel]) VALUES (N'4', N'test4', N'cccc', N'2', null, null, null, null, null)
GO
GO
INSERT INTO [test].[user_info] ([Id], [username], [password], [usertype], [enabled], [realname], [qq], [email], [tel]) VALUES (N'5', N'test5', N'dddd', N'1', null, null, null, null, null)
GO
GO

-- ----------------------------
-- Indexes structure for table city
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table city
-- ----------------------------
ALTER TABLE [test].[city] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Indexes structure for table country
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table country
-- ----------------------------
ALTER TABLE [test].[country] ADD PRIMARY KEY ([Id])
GO

-- ----------------------------
-- Indexes structure for table user_info
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table user_info
-- ----------------------------
ALTER TABLE [test].[user_info] ADD PRIMARY KEY ([Id])
GO
