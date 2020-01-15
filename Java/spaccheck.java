private static void RemoveSpaces()
{
string temp = "nayni sh sdfg j k k";
char[] myArr = temp.ToCharArray();
SpaceCheck(ref myArr, 0, 0);
foreach (char item in myArr)
{
Console.Write(item);
}
}

private static void SpaceCheck(ref char[] myArr, int i, int j)
{
if (i < myArr.Length)
{
if (Char.IsWhiteSpace(myArr[i]))
{
if (!Char.IsWhiteSpace(myArr[j]))
{
j++;
SpaceCheck(ref myArr, i, j);
}
else
{
i++;
SpaceCheck(ref myArr, i, j);
}
}
else if (!Char.IsWhiteSpace(myArr[i]))
{
if (Char.IsWhiteSpace(myArr[j]))
{
char temp;
temp = myArr[i];
myArr[i] = myArr[j];
myArr[j] = temp;
i++; j++;
SpaceCheck(ref myArr, i, j);
}
else
{
j++; i++;
SpaceCheck(ref myArr, i, j);
}
}
}
}
